package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses , Long> {
}
