package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Incomes;

import com.kahraman.kaan.entity.Invoices;
import com.kahraman.kaan.repository.InvoicesRepository;
import com.kahraman.kaan.service.IncomesService;
import com.kahraman.kaan.service.InvoicesService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import static java.lang.System.in;

@Service
@Data
@RequiredArgsConstructor
public class InvoicesServiceImpl implements InvoicesService {

    private final InvoicesRepository invoicesRepository;


    @Override
    public Invoices createInvoices(Invoices invoices) {
        return invoicesRepository.save(invoices);
    }

    @Override
    public List<Invoices> getInvoices() {
        return invoicesRepository.findAll();
    }

    @Override
    public Invoices getInvoices(Long id) {
        Optional<Invoices> getInvoices = invoicesRepository.findById(id);
        if (getInvoices.isPresent()){
            return getInvoices.get();
        }
        return null;
    }

    @Override
    public Invoices updateInvoices(Long id, Invoices invoices) {
        Optional<Invoices> update = invoicesRepository.findById(id);
        if (update.isPresent()){
            update.get().setContractId(invoices.getContractId());
            update.get().setInvoiceid(invoices.getInvoiceid());
            update.get().setPropertyOwnersId(invoices.getPropertyOwnersId());
            update.get().setAmount(invoices.getAmount());
            update.get().setIncoiceDate(invoices.getIncoiceDate());
            update.get().setAccountId(invoices.getAccountId());
            return  invoicesRepository.save(update.get());
        }
        return null;
    }

    @Override
    public Boolean deleteInvoices(Long id) {
        Optional<Invoices> deleteInvoices = invoicesRepository.findById(id);
        if(deleteInvoices.isPresent()){
            invoicesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
