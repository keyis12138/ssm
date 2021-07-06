package com.xtq.controller;

import com.xtq.entity.User;
import com.xtq.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping("/checkname")
    @ResponseBody
    public String check(@RequestParam("username")String username){
        User user = userService.checkname(username);
        if(user!=null){
            return "false";
        }else {
            return "true";
        }
    }

    @RequestMapping(value = "/doRegister",method = RequestMethod.POST)
    @ResponseBody String doRegister(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email){
        User user = new User(null,username,password,email,"user");
        userService.saveUser(user);
        return "true";
    }

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> doLogin(@RequestParam("username") String username, @RequestParam("password") String password){
        User user = userService.login(username,password);
        Map<String,Object>result = new HashMap<>();
        if(user!=null){
            result.put("result","true");
            result.put("role",user.getType());
            return result;
        }else{
            result.put("result","false");
            return result;
        }
    }
}
