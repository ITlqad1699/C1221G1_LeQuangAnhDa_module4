package com.codegym.casestudy.service.impl;

import com.codegym.casestudy.repository.IFacilityRepository;
import com.codegym.casestudy.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    IFacilityRepository iFacilityRepository;
}
