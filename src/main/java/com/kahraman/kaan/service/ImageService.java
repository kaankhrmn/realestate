package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Images;

import java.awt.*;
import java.util.List;

public interface ImageService {

    Images createImages(Images images);
    List<Images> getAllImages();
    Images getAllImages(Long id);
    Images updateImages(Long id , Images images);
    Boolean deleteImages(Long id);
}
