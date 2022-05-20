package com.codegym.casestudy.service.impl;

import com.codegym.casestudy.repository.IContractRepository;
import com.codegym.casestudy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository iContractRepository;
}
