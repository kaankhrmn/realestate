package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Expenses;
import com.kahraman.kaan.repository.ExpensesRepository;
import com.kahraman.kaan.service.ExpensesService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@Data
@RequestMapping("/expenses")
public class ExpensesController {

    private final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @PostMapping("/create")
    public ResponseEntity<Expenses> create(@RequestBody Expenses expenses){
        Expenses result = expensesService.createExpenses(expenses);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Expenses>> getAll(){
        List<Expenses> result = expensesService.getExpenses();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Expenses> getByid(@PathVariable ("id") Long id){
        Expenses result = expensesService.getExpenses(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Expenses> update(@PathVariable ("id") Long id, @RequestBody Expenses expenses){
        Expenses result = expensesService.updateExpenses(id,expenses);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("delete//{id}")
    public ResponseEntity<Boolean> delete(@PathVariable ("id") Long id){
        Boolean result = expensesService.deleteExpenses(id);
        return ResponseEntity.ok(result);
    }
}