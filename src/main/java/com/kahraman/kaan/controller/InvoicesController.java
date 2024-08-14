package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Invoices;
import com.kahraman.kaan.service.InvoicesService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Repeatable;
import java.util.List;
@CrossOrigin
@RestController
@Data
@RequestMapping("/invoices")

public class InvoicesController {

    private final InvoicesService invoicesService;

    @PostMapping("/create")
    public ResponseEntity<Invoices> createInvioces(@RequestBody Invoices invoices){
        Invoices result = invoicesService.createInvoices(invoices);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Invoices>> getAllInvioces(){
        List<Invoices> result = invoicesService.getInvoices();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Invoices> getAllInvoices(@PathVariable ("id") Long id){
        Invoices result = invoicesService.getInvoices(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Invoices> updateInvoices(@PathVariable ("id") Long id,@RequestBody Invoices invoices){
        Invoices result = invoicesService.updateInvoices(id,invoices);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteInvoices(@PathVariable ("id") Long id){
        Boolean result = invoicesService.deleteInvoices(id);
        return ResponseEntity.ok(result);
    }
}
