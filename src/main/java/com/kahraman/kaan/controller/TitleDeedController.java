package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.TitleDeed;
import com.kahraman.kaan.repository.TitleDeedRepository;
import com.kahraman.kaan.service.TitleDeedService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/titleDeed")
public class TitleDeedController {

   public final TitleDeedService titleDeedService;

    public TitleDeedController(TitleDeedRepository titleDeedRepository, TitleDeedService titleDeedService) {
        this.titleDeedService = titleDeedService;
    }


    @PostMapping("/create")
    public ResponseEntity<TitleDeed> createTitleDeed(@RequestBody TitleDeed titleDeed){
       TitleDeed result = titleDeedService.createTitleDeed(titleDeed);
       return ResponseEntity.ok(result);
   }


   @GetMapping("/getAll")
       public ResponseEntity<List<TitleDeed>> getTitleDeed(){
            List<TitleDeed> titleDeed = titleDeedService.getTitleDeed();
            return ResponseEntity.ok(titleDeed);
       }


   @GetMapping("/getByid/{id}")
   public ResponseEntity<TitleDeed> getTitleDeed(@PathVariable("id") Long id){
       TitleDeed titleDeed = titleDeedService.getTitleDeed(id);
       return ResponseEntity.ok(titleDeed);
   }

   @PutMapping("/update/{id}")
   public ResponseEntity<TitleDeed> resultTitleDeed(@PathVariable("id") Long id ,@RequestBody TitleDeed titleDeed){
        TitleDeed result = titleDeedService.updateTitleDeed(id,titleDeed);
        return ResponseEntity.ok(result);
   }

   @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteTitleDeed(@PathVariable("id") Long id){
       Boolean status = titleDeedService.deleteTitleDeed(id);
       return ResponseEntity.ok(status);
   }
}
