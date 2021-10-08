package com.github.puzzle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@Component
public class PuzzleService implements PuzzleServiceInterface{

    @Autowired
    PuzzleImage puzzleImage;

    @Autowired
    private ImageLoader imageLoader;

    public PuzzleService() {
        puzzleImage.setImage(imageLoader.getImage());
    }

    public PuzzleImage getImage() {
        return puzzleImage;
    }

}
