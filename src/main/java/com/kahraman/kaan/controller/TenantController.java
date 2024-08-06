package com.kahraman.kaan.controller;

import com.kahraman.kaan.entity.Tenant;
import com.kahraman.kaan.service.TenantService;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/tenant")

public class TenantController {

    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping("/create")
    public ResponseEntity<Tenant> createTenante(@RequestBody Tenant tenant){
        Tenant result = tenantService.createTenant(tenant);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Tenant>> getTenant(){
        List<Tenant> result = tenantService.getAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByid/{id}")
    public ResponseEntity<Tenant> getTenant(@PathVariable ("id") Long id){
        Tenant result = tenantService.getAll(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Tenant> updateTenant(@PathVariable ("id") Long id , @RequestBody Tenant tenant){
        Tenant result = tenantService.updateTenant(id,tenant);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteTenant(@PathVariable ("id") Long id){
        Boolean result = tenantService.deleteTenant(id);
        return ResponseEntity.ok(result);
    }

}
