package com.github.puzzle.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public static final String REQUEST_MAPPING = "/";

    @GetMapping
    public String getHomePage() {
        return "home";
    }

}
