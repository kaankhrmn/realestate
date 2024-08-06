package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.PropertyOwners;
import com.kahraman.kaan.repository.PropertyOwnersRepository;
import com.kahraman.kaan.service.PropertyOwnersService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data

public class PropertyOwnersServiceImpl implements PropertyOwnersService {

    private final PropertyOwnersRepository propertyOwnersRepository;

    @Override
    public PropertyOwners createPropertyOwners(PropertyOwners propertyOwners) {
        return propertyOwnersRepository.save(propertyOwners);
    }

    @Override
    public List<PropertyOwners> getPropertyOwners() {
        return propertyOwnersRepository.findAll();
    }

    @Override
    public PropertyOwners getPropertyOwners(Long id) {
        Optional<PropertyOwners> propertyOwners = propertyOwnersRepository.findById(id);
        if (propertyOwners.isPresent()){
            return propertyOwners.get();
        }
        return null;
    }

    @Override
    public PropertyOwners updatePropertyOwners(Long id, PropertyOwners propertyOwners) {
        Optional<PropertyOwners> result = propertyOwnersRepository.findById(id);
        if (result.isPresent()){
            result.get().setPropertyId(propertyOwners.getPropertyId());
            result.get().setContractId(propertyOwners.getContractId());
            result.get().setAccountNumber(propertyOwners.getAccountNumber());
            result.get().setTitleDeedId(propertyOwners.getTitleDeedId());
            result.get().setBankName(propertyOwners.getBankName());
            result.get().setPriceUnit(propertyOwners.getPriceUnit());
            result.get().setCardHolder(propertyOwners.getCardHolder());
            result.get().setIban(propertyOwners.getIban());
            result.get().setTotalMoney(propertyOwners.getTotalMoney());
            return propertyOwnersRepository.save(result.get());
        }
        return null;
    }


    @Override
    public Boolean deletePropertyOwners(Long id) {
        Optional<PropertyOwners> result  =propertyOwnersRepository.findById(id);
        if (result.isPresent()){
            propertyOwnersRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
