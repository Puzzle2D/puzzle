package com.github.puzzle.service;

import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@Component
public class PuzzleImage {

    BufferedImage image;

    public void setImage(BufferedImage image) {
        image = image;
    }

    public BufferedImage getImage() {
        return image;
    }
}
