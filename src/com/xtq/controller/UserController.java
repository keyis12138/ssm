package com.xtq.controller;

import com.xtq.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        logger.debug("username"+username+",password="+password);
        userService.login(username,password);
        return "";

    }
}