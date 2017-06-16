package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:geyou02@meituan.com
 * Date:17/6/14
 * TIme:下午11:10
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    @RequestMapping("/mvc")
    //host:8080/hello/mvc
    public String helloMvc(){
        return "home";
    }
}
