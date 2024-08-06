package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.PropertyOwners;
import com.kahraman.kaan.service.PropertyOwnersService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/propertyOwners")
public class PropertyOwnersController  {

    private final PropertyOwnersService propertyOwnersService;

    public PropertyOwnersController(PropertyOwnersService propertyOwnersService) {
        this.propertyOwnersService = propertyOwnersService;
    }


    @PostMapping("/create")
    public ResponseEntity<PropertyOwners> createPropertyOwners(@RequestBody PropertyOwners propertyOwners){
        PropertyOwners result = propertyOwnersService.createPropertyOwners(propertyOwners);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PropertyOwners>> getAllPropertyOwners(){
        List<PropertyOwners> result = propertyOwnersService.getPropertyOwners();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<PropertyOwners> getAllPropertyOwners(@PathVariable("id") Long id){
        PropertyOwners result = propertyOwnersService.getPropertyOwners(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/getByid/{id}")
    public ResponseEntity<PropertyOwners> updatePropertyOwners(@PathVariable("id") Long id  , @RequestBody PropertyOwners propertyOwners){
        PropertyOwners result  = propertyOwnersService.updatePropertyOwners(id,propertyOwners);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deletePropertyOwners(@PathVariable("id") Long id){
        Boolean result = propertyOwnersService.deletePropertyOwners(id);
        return ResponseEntity.ok(result);
    }



}
