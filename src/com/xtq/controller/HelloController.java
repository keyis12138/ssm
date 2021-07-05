package com.xtq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("username","xtq");
        return modelAndView;
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2(@RequestParam(name = "username") String username){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello2");
        modelAndView.addObject("username",username);
        return modelAndView;
    }


}
