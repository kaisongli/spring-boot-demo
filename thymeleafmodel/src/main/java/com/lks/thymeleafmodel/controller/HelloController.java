package com.lks.thymeleafmodel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by likaisong on 2019-05-30.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public ModelAndView hello(ModelAndView mv){
        mv.setViewName("hello");
        mv.addObject("title", "World");
        return mv;
    }
}