package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Tenant;

import java.util.List;

public interface TenantService {

    Tenant createTenant(Tenant tenant);
    List<Tenant> getAll();
    Tenant getAll(Long id);
    Tenant updateTenant(Long id , Tenant tenant);
    Boolean deleteTenant(Long id);

}
