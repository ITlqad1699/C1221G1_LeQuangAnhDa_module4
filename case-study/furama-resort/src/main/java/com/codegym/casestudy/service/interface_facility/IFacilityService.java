package com.codegym.casestudy.service.interface_facility;

import com.codegym.casestudy.model.service.Service;

import java.util.List;

public interface IFacilityService {
    List<Service> findAll();

    void save(Service service);
}
