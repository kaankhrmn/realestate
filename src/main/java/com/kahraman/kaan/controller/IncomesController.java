package com.kahraman.kaan.controller;
import com.kahraman.kaan.entity.Incomes;
import com.kahraman.kaan.entity.Property;
import com.kahraman.kaan.service.IncomesService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Data
@RestController
@RequestMapping("/incomes")

public class IncomesController {

    private final IncomesService incomesService;

    public IncomesController(IncomesService incomesService) {
        this.incomesService = incomesService;
    }


    @PostMapping("/create")
    public ResponseEntity<Incomes> createIncomes(@RequestBody Incomes incomes){
        Incomes result = incomesService.createIncomes(incomes);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Incomes>> getIncomes(){
        List<Incomes> result = incomesService.getIncomes();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Incomes> getByid(@PathVariable ("id") Long id){
        Incomes result = incomesService.getIncomes(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Incomes> updateIncomes(@PathVariable("id") Long id , @RequestBody Incomes incomes) {
        Incomes result = incomesService.updateIncomes(id, incomes);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteIncomes(@PathVariable("id") Long id){
        Boolean result = incomesService.deleteIncomes(id);
        return ResponseEntity.ok(result);
    }



}