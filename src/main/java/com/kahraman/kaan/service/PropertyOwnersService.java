package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.PropertyOwners;

import java.util.List;



public interface PropertyOwnersService {
    PropertyOwners createPropertyOwners(PropertyOwners propertyOwners);
    List<PropertyOwners> getPropertyOwners();
    PropertyOwners getPropertyOwners(Long id);
    PropertyOwners updatePropertyOwners(Long id , PropertyOwners propertyOwners);
    Boolean deletePropertyOwners(Long id);

}
