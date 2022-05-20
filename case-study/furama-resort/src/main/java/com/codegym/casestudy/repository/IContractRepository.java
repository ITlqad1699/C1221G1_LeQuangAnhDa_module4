package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Integer> {
}
