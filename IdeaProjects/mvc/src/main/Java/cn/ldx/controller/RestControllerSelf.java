package cn.ldx.controller;

import cn.ldx.model.AboutEntity;
import cn.ldx.model.SchoolEntity;
import cn.ldx.model.StoreEntity;
import cn.ldx.repository.AboutRepository;
import cn.ldx.repository.SchoolRepository;
import cn.ldx.repository.StoreRepository;
import cn.ldx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.ldx.model.UserEntity;
import cn.ldx.model.ResponseEntity;
import java.util.List;

/**
 * Created by Doenix Liu on 2017/2/17.
 */

@RestController
@RequestMapping(value = "/api")
public class RestControllerSelf {
    @Autowired
    UserRepository userRepository;
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    StoreRepository storeRepository;
    @Autowired
    AboutRepository aboutRepository;

    @RequestMapping(value = "/schools",method = RequestMethod.GET)
    public List<SchoolEntity> viewSchool(){
        return schoolRepository.findAll();
    }
    @RequestMapping(value = "/schools",method = RequestMethod.POST)
    public ResponseEntity createSchool(@ModelAttribute("school") SchoolEntity aSchool){
        try {
            schoolRepository.saveAndFlush(aSchool);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }
    @RequestMapping(value = "/schools",method = RequestMethod.DELETE)
    public ResponseEntity removeSchool(@RequestParam int id){
        try {
            schoolRepository.delete(id);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }


    @RequestMapping(value = "/admins",method = RequestMethod.GET)
    public List<UserEntity> viewAdmin(){
        return userRepository.findAll();
    }
    @RequestMapping(value = "/admins",method = RequestMethod.POST)
    public ResponseEntity createAdmin(@ModelAttribute("admin") UserEntity aUser){
        try {
            userRepository.saveAndFlush(aUser);
            return new ResponseEntity().success();
        }
        catch (Exception E) {
            return new ResponseEntity().failure();
        }
    }
    @RequestMapping(value = "/admins",method = RequestMethod.DELETE)
    public ResponseEntity deleteAdmin(@RequestParam int id) {
        try {
            userRepository.delete(id);
            return new ResponseEntity().success();
        }
        catch (Exception E) {
            return new ResponseEntity().failure();
        }
    }


    @RequestMapping(value = "/stores",method = RequestMethod.GET)
    public List<StoreEntity> viewStore(){
        return storeRepository.findAll();
    }
    @RequestMapping(value = "/stores",method = RequestMethod.POST)
    public ResponseEntity createStore(@ModelAttribute("store")StoreEntity aStore){
        try {
            storeRepository.saveAndFlush(aStore);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }
    @RequestMapping(value = "/stores",method = RequestMethod.DELETE)
    public ResponseEntity deleteStore(@RequestParam int id){
        try {
            storeRepository.delete(id);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }


    @RequestMapping(value = "/abouts",method = RequestMethod.GET)
    public List<AboutEntity> viewAbout(){
        return aboutRepository.findAll();
    }
    @RequestMapping(value = "/abouts",method = RequestMethod.POST)
    public ResponseEntity createAbout(@ModelAttribute("about")AboutEntity anAbout){
        try {
            aboutRepository.saveAndFlush(anAbout);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }
    @RequestMapping(value = "/abouts",method = RequestMethod.DELETE)
    public ResponseEntity deleteAbout(@RequestParam int id){
        try {
            aboutRepository.delete(id);
            return new ResponseEntity().success();
        }
        catch (Exception E){
            return new ResponseEntity().failure();
        }
    }
}
