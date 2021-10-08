package com.github.puzzle.service;

import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@Component
public class ImageLoader {

    BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }
}
