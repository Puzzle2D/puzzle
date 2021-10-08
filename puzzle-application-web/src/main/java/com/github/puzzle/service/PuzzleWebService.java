package com.github.puzzle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@Component
public class PuzzleWebService {

    @Autowired
    PuzzleService puzzleService;

    public PuzzleImage getImage(){
        return puzzleService.getImage();
    }
}
