package com.wang.controller;

import com.wang.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author 王冰炜
 * @create 2021-05-21 14:56
 */
@Controller
@RequestMapping("/user")
public class Login {

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session, Model model){
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "login";
    }



    @PostMapping("/check")
    @ResponseBody
    public User check(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
