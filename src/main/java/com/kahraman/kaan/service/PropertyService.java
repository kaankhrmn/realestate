package com.kahraman.kaan.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.kahraman.kaan.entity.Property;

import java.util.List;


public interface PropertyService {
    Property creatProperty(Property property);
    List<Property> getProperty();
    Property getProperty(Long id);
    Property updateProperty(Long id , Property property);
    Boolean deleteProperty(Long id);
}
