package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.service.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityRepository extends JpaRepository<Service,Integer> {
}
