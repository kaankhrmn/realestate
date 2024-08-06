package com.kahraman.kaan.service;

import com.kahraman.kaan.entity.Contract;

import java.util.List;

public interface ContractService {

    Contract createContract(Contract contract);
    List<Contract> getContract();
    Contract getContract(Long id);
    Contract updateContract(Long id , Contract contract);
    Boolean deleteContract(Long id);

}
