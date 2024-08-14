package com.kahraman.kaan.controller;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.kahraman.kaan.entity.Property;
import com.kahraman.kaan.repository.PropertyRepository;
import com.kahraman.kaan.service.PropertyService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@Data
@RequestMapping("/property")
public class PropertyController {

    public final PropertyService propertyService;

    public PropertyController(PropertyRepository propertyRepository, PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping("/create")
    public ResponseEntity<Property> createProperty(@RequestBody Property property){
        Property result = propertyService.creatProperty(property);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Property>> getProperty(){
        List<Property> property = propertyService.getProperty();
        return ResponseEntity.ok(property);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Property> getProperty(@PathVariable("id") Long id){
        Property property = propertyService.getProperty(id);
        return ResponseEntity.ok(property);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Property> updateProperty(@PathVariable("id") Long id ,@RequestBody Property property){
            Property result = propertyService.updateProperty(id,property);
            return ResponseEntity.ok(result);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteProperty(@PathVariable("id") Long id){
        Boolean status = propertyService.deleteProperty(id);
        return ResponseEntity.ok(status);
    }





}
