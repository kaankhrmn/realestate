package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Contract;
import com.kahraman.kaan.repository.ContractRepository;
import com.kahraman.kaan.service.ContractService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/contract")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;

    }

    @PostMapping("/create")
    public ResponseEntity<Contract> create(@RequestBody Contract contract){
        Contract result = contractService.createContract(contract);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public  ResponseEntity<List<Contract>> getAll(){
        List<Contract> result = contractService.getContract();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Contract> getAll(@PathVariable("id") Long id){
        Contract result = contractService.getContract(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Contract> updateContract(@PathVariable("id") Long id ,@RequestBody Contract contract){
        Contract result = contractService.updateContract(id , contract);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteContract(@PathVariable("id") Long id){
        Boolean result = contractService.deleteContract(id);
        return ResponseEntity.ok(result);
    }
}
