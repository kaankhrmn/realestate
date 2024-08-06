package com.kahraman.kaan.service;


import com.kahraman.kaan.entity.Incomes;

import java.util.List;

public interface IncomesService {
    Incomes createIncomes(Incomes incomes);
    List<Incomes> getIncomes();
    Incomes getIncomes(Long id);
    Incomes updateIncomes(Long id , Incomes incomes);
    Boolean deleteIncomes(Long id);
}
