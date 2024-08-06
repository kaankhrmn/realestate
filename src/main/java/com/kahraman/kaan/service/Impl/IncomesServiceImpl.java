package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Incomes;
import com.kahraman.kaan.repository.IncomesRepository;
import com.kahraman.kaan.service.IncomesService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor

public class IncomesServiceImpl implements IncomesService {
    private final IncomesRepository incomesRepository;

    @Override
    public Incomes createIncomes(Incomes incomes) {
        return incomesRepository.save(incomes);
    }

    @Override
    public List<Incomes> getIncomes() {
        return incomesRepository.findAll();
    }

    @Override
    public Incomes getIncomes(Long id) {
        Optional<Incomes> getIncomes = incomesRepository.findById(id);
        if (getIncomes.isPresent()){
            return getIncomes.get();
        }
        return null;
    }

    @Override
    public Incomes updateIncomes(Long id, Incomes incomes) {
        Optional<Incomes> update = incomesRepository.findById(id);
        if (update.isPresent()){
            update.get().setIncomesType(incomes.getIncomesType());
            update.get().setPropertyOwners(incomes.getPropertyOwners());
            update.get().setAmount(incomes.getAmount());
            update.get().setDescription(incomes.getDescription());
            update.get().setPaymentDate(incomes.getPaymentDate());
            update.get().setPaymentSource(incomes.getPaymentSource());
            update.get().setSessionId(incomes.getSessionId());
            return incomesRepository.save(update.get());
        }
        return null;
    }

    @Override
    public Boolean deleteIncomes(Long id) {
        Optional<Incomes> delete = incomesRepository.findById(id);
        if (delete.isPresent()){
            incomesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
