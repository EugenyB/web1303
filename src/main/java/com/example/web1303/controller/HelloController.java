package com.example.web1303.controller;

import com.example.web1303.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @PostMapping("/hello")
    public String hello(@RequestParam String username, @RequestParam int userage, Model model) {
        User user = new User(username, userage);
        model.addAttribute("user", user);
        return "hello";
    }
}
