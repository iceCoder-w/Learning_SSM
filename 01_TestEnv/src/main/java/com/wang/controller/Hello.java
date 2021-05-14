package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王冰炜
 * @create 2021-05-14 14:59
 */

@Controller
@RequestMapping("/HelloController")
public class Hello {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";
    }

    @RequestMapping("/world")
    public String world(Model model){
        model.addAttribute("msg","World!");
        return "world";
    }
}
