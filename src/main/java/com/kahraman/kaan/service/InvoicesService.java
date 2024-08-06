package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Invoices;

import java.util.List;

public interface InvoicesService {
    Invoices createInvoices(Invoices invoices);
    List<Invoices> getInvoices();
    Invoices getInvoices(Long id);
    Invoices updateInvoices(Long id , Invoices invoices);
    Boolean deleteInvoices(Long id);
}
