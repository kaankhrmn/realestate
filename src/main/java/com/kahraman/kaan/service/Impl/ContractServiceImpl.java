package com.kahraman.kaan.service.Impl;

import com.kahraman.kaan.entity.Contract;
import com.kahraman.kaan.repository.ContractRepository;
import com.kahraman.kaan.service.ContractService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data

public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;

    @Override
    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> getContract() {
        return contractRepository.findAll();
    }

    @Override
    public Contract getContract(Long id) {
        Optional<Contract> contract = contractRepository.findById(id);
        if (contract.isPresent()){
            return contract.get();
        }
        return null;
    }

    @Override
    public Contract updateContract(Long id, Contract contract) {
        Optional<Contract> result  =contractRepository.findById(id);
        if (result.isPresent()){
            result.get().setMainContractId(contract.getMainContractId());
            result.get().setAttendantId(contract.getAttendantId());
            result.get().setTenantId(contract.getTenantId());
            result.get().setStatus(contract.getStatus());
            result.get().setBalance(contract.getBalance());
            result.get().setInvoice(contract.getInvoice());
            result.get().setStartDate(contract.getStartDate());
            result.get().setExpiraDate(contract.getExpiraDate());
            result.get().setPeriod(contract.getPeriod());
            result.get().setNotes(contract.getNotes());
            result.get().setRentMoney(contract.getRentMoney());
            return contractRepository.save(result.get());
        }
        return null;
    }

    @Override
    public Boolean deleteContract(Long id) {
        Optional<Contract> contract = contractRepository.findById(id);
        if (contract.isPresent()){
            contractRepository.deleteById(id);
            return true;
        }
        return  false;
    }
}
