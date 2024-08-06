package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Expenses;
import com.kahraman.kaan.repository.ExpensesRepository;
import com.kahraman.kaan.service.ExpensesService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor

public class ExpensesServiceImpl implements ExpensesService {

    private final ExpensesRepository expensesRepository;

    @Override
    public Expenses createExpenses(Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    @Override
    public List<Expenses> getExpenses() {
        return expensesRepository.findAll();
    }

    @Override
    public Expenses getExpenses(Long id) {
        Optional<Expenses> result = expensesRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        return null;
    }

    @Override
    public Expenses updateExpenses(Long id, Expenses expenses) {
        Optional<Expenses> result = expensesRepository.findById(id);
        if (result.isPresent()){
            result.get().setPropertyId(expenses.getPropertyId());
            result.get().setAmount(expenses.getAmount());
            result.get().setDescription(expenses.getDescription());
            result.get().setInvoiced(expenses.getInvoiced());
            result.get().setPaymentDate(expenses.getPaymentDate());
            result.get().setPropertyOwners(expenses.getPropertyOwners());
            result.get().setFileName(expenses.getFileName());
            return expensesRepository.save(result.get());
        }
        return null;
    }

    @Override
    public Boolean deleteExpenses(Long id) {
        Optional<Expenses> result = expensesRepository.findById(id);
        if (result.isPresent()){
            expensesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
