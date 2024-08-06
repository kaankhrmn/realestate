package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
