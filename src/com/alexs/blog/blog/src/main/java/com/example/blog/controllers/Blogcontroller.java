package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blogcontroller {
    @GetMapping("/blog")
    public String blogMain(Model model) {
        return "blog-Main";
    }
}
