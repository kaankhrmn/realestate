package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Property;
import com.kahraman.kaan.repository.PropertyRepository;
import com.kahraman.kaan.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    @Override
    public Property creatProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public List<Property> getProperty() {
        return propertyRepository.findAll();

    }

    @Override
    public Property getProperty(Long id) {
        Optional<Property> property = propertyRepository.findById(id);
        if (property.isPresent()){
            return property.get();
        }
        return null;
    }

    @Override
    public Property updateProperty(Long id, Property property) {
        Optional<Property> resultProperty  =propertyRepository.findById(id);
        if (resultProperty.isPresent()){
            resultProperty.get().setPropertyType(property.getPropertyType());
            resultProperty.get().setPropertyName(property.getPropertyName());
            resultProperty.get().setDescription(property.getDescription());
            resultProperty.get().setAdress(property.getAdress());
            resultProperty.get().setCity(property.getCity());
            resultProperty.get().setCountry(property.getCountry());
            resultProperty.get().setCounty(property.getCounty());
            resultProperty.get().setDistrict(property.getCity());
            resultProperty.get().setDistrictId(property.getDistrictId());
            resultProperty.get().setInternalCode(property.getInternalCode());
            resultProperty.get().setStatus(property.getStatus());
            resultProperty.get().setM2(property.getM2());
            resultProperty.get().setOwnerName(property.getOwnerName());
            resultProperty.get().setTitleDeedId(property.getTitleDeedId());
            resultProperty.get().setHasTax(property.getHasTax());
            return propertyRepository.save(resultProperty.get());
        }
        return null;
    }

    @Override
    public Boolean deleteProperty(Long id) {
        Optional<Property> property = propertyRepository.findById(id);
        if (property.isPresent()){
            propertyRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
