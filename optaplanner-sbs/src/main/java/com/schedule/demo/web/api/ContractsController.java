package com.schedule.demo.web.api;

import com.schedule.demo.entity.Contract;
import com.schedule.demo.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: John Long
 * @create: 22-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class ContractsController {
    @Autowired
    private ContractService contractService;

    public ContractsController(ContractService contractService){
        this.contractService = contractService;
    }

    @RequestMapping("/contracts")
    public List<Contract> contractsList(){
        return contractService.getAllContracts();
    }

    @PostMapping("/contracts")
    public Contract saveContract(@RequestBody @NotNull Contract contract){
        return contractService.saveContract(contract);
    }

    @DeleteMapping("/contracts/{id}")
    public void deleteContract(@PathVariable Long contractID){
        contractService.deleteContract(contractID);
    }

}
