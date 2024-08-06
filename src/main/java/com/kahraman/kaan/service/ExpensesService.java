package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Expenses;

import java.util.List;

public interface ExpensesService {
    Expenses createExpenses(Expenses expenses);
    List<Expenses> getExpenses();
    Expenses getExpenses(Long id);
    Expenses updateExpenses(Long id , Expenses expenses);
    Boolean deleteExpenses(Long id);
}
