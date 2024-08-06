package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract , Long> {
}
