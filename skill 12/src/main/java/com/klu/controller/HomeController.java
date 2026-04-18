package com.klu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<String> skills = Arrays.asList("Java", "Spring Boot", "Hibernate", "REST API", "Thymeleaf");
        model.addAttribute("skills", skills);
        model.addAttribute("title", "Full Stack Development Skills");
        return "home";
    }
}