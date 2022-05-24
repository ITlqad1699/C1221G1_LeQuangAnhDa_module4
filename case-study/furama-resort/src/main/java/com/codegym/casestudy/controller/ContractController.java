package com.codegym.casestudy.controller;

import com.codegym.casestudy.service.interface_contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @GetMapping()
    public String goContractPage() {
        return "contract/contract_list";
    }
}
