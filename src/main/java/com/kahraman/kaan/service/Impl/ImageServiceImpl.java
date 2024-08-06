package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Images;
import com.kahraman.kaan.repository.ImagesRepository;
import com.kahraman.kaan.service.ImageService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor

public class ImageServiceImpl implements ImageService {
    private final ImagesRepository imagesRepository;

    @Override
    public Images createImages(Images images) {
        return imagesRepository.save(images);
    }

    @Override
    public List<Images> getAllImages() {
        return imagesRepository.findAll();
    }

    @Override
    public Images getAllImages(Long id) {
        Optional<Images> getImages = imagesRepository.findById(id);
        if (getImages.isPresent()){
            return getImages.get();
        }
        return null;
    }

    @Override
    public Images updateImages(Long id, Images images) {
        Optional<Images> result = imagesRepository.findById(id);
        if (result.isPresent()){
            result.get().setPorpertyId(images.getPorpertyId());
            result.get().setImagePath(images.getImagePath());
            return imagesRepository.save(result.get());
        }
        return null;
    }

    @Override
    public Boolean deleteImages(Long id) {
        Optional<Images> deleteImages = imagesRepository.findById(id);
        if (deleteImages.isPresent()){
            imagesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
