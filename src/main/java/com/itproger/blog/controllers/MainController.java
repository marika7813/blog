package com.itproger.blog.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {

    @GetMapping("/")
    public String home (Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about (Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
}

