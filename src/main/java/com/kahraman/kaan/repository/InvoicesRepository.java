package com.kahraman.kaan.repository;

import com.kahraman.kaan.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoicesRepository  extends JpaRepository<Invoices, Long> {
}
