package com.schedule.demo.service;

import com.schedule.demo.entity.Contract;
import com.schedule.demo.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public void deleteContract(Long contractID) {
        contractRepository.deleteById(contractID);
    }

    public Contract getContractForEmployee(Long contractId){
        return contractRepository.findContractOfAnEmployee(contractId);
    }
}
