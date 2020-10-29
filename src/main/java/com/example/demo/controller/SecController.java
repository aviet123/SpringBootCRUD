package com.example.demo.controller;


import com.example.demo.model.AppUser;
import com.example.demo.service.appuser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class SecController {

    @Autowired
    AppUserService appUserService;

    @GetMapping("/khongcoquyen")
    public String accessDenied(){
        return "unauthorized";
    }
    @GetMapping("/loginfailed")
    public String loginFailed(){
        return "error";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/admin")
    public String adminHome(){
        return "home";
    }
    @GetMapping("/")
    public String userHome(){
        return "home";
    }
    @PostMapping("/login")
    public String home(){
        return "home";
    }
}
