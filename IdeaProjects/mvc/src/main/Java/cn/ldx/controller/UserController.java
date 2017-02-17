package cn.ldx.controller;

import cn.ldx.model.UserEntity;
import cn.ldx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Doenix Liu on 2017/2/16.
 */

@Controller
@RequestMapping(value = "/admin")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public String addUser() {
        // 转到 admin/addUser.jsp页面
        return "admin/adduser";
    }
    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/users/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") UserEntity userEntity) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        UserEntity userEntity1 = userRepository.saveAndFlush(userEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/users";
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap) {
        // 查询user表中所有记录
        List<UserEntity> userList = userRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("userList", userList);

        // 返回pages目录下的admin/users.jsp页面
        return "admin/users";
    }
    @RequestMapping(value = "/delete/{ID}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable int ID){
        userRepository.delete(ID);
        return "redirect:/admin/users";
    }
    @RequestMapping(value = "update/{ID}",method = RequestMethod.GET)
    public String updateUser(@PathVariable int ID){
        userRepository.delete(ID);
        return "redirect:/admin/users";
    }
}
