package com.codegym.casestudy.service.impl.facility;

import com.codegym.casestudy.repository.facility.IFacilityRepository;
import com.codegym.casestudy.service.interface_facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    IFacilityRepository iFacilityRepository;

    @Override
    public List<com.codegym.casestudy.model.service.Service> findAll() {
        return iFacilityRepository.findAll();
    }

    @Override
    public void save(com.codegym.casestudy.model.service.Service service) {
        this.iFacilityRepository.save(service);
    }
}
