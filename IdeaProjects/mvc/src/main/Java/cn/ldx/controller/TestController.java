package cn.ldx.controller;

/**
 * Created by Doenix Liu on 2017/2/15.
 */
import cn.ldx.model.UserEntity;
import cn.ldx.repository.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/{param}",method = RequestMethod.GET)
    public void testBasic(@PathVariable String param) {
        int paramint = Integer.parseInt(param);
        if (paramint == 1) System.out.println("test1 OK"); ;
        if (paramint == 2) {
            UserEntity user = new UserEntity();
            user.setUsername("xixihaha");
            user.setPassword("bizhui");
            userRepository.saveAndFlush(user);
            System.out.println(user);

        }
        else System.out.println("else");
    }
    @RequestMapping(value = "/deep")
    public String test(){
        System.out.println("19931226");
        return "redirect:/admin/users";
    }
}

