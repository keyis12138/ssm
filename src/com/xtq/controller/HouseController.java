package com.xtq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("house")
public class HouseController {
    @RequestMapping("houselist")
    public ModelAndView houselist(){
        ModelAndView modelAndView = new ModelAndView();
    return modelAndView;
    }
}
