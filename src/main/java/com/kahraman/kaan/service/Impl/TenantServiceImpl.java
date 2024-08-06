package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Tenant;
import com.kahraman.kaan.repository.TenantRepository;
import com.kahraman.kaan.service.TenantService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data

public class TenantServiceImpl implements TenantService {

    private final TenantRepository tenantRepository;


    @Override
    public Tenant createTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public List<Tenant> getAll() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenant getAll(Long id) {
        Optional<Tenant> tenant = tenantRepository.findById(id);
        if (tenant.isPresent()){
            return tenant.get();
        }
        return null;
    }

    @Override
    public Tenant updateTenant(Long id, Tenant tenant) {
        Optional<Tenant> result = tenantRepository.findById(id);
        if (result.isPresent()){
            result.get().setTenantName(tenant.getTenantName());
            result.get().setInternalCode(tenant.getInternalCode());
            result.get().setAdress(tenant.getAdress());
            result.get().setEmail(tenant.getEmail());
            result.get().setContactName(tenant.getContactName());
            result.get().setPhone(tenant.getPhone());
            return tenantRepository.save(result.get());
        }
        return null;
    }

    @Override
    public Boolean deleteTenant(Long id) {
        Optional<Tenant> tenant = tenantRepository.findById(id);
        if (tenant.isPresent()){
            tenantRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
