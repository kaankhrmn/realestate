package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Images;
import com.kahraman.kaan.service.ImageService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/images")

public class ImagesController {
    private final ImageService imageService;

    public ImagesController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("create")
    public ResponseEntity<Images> createImages(@RequestBody Images images){
        Images result = imageService.createImages(images);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Images>> getAll(){
        List<Images> result = imageService.getAllImages();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Images> getByid(@PathVariable ("id") Long id){
        Images result = imageService.getAllImages(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Images> updateImages(@PathVariable ("id") Long id , Images images){
        Images result = imageService.updateImages(id,images);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable ("id") Long id){
        Boolean result = imageService.deleteImages(id);
        return ResponseEntity.ok(result);
    }











}
