package com.github.puzzle.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
    public static final String REQUEST_MAPPING = "/game";

    @GetMapping
    public String getGamePage() {
        return "game";
    }

}
