package com.codegym.service.impl;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalServiceRepository;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {
    @Autowired
    IMedicalServiceRepository iMedicalServiceRepository;
    @Override
    public MedicalDeclaration getMedical() {
        return this.iMedicalServiceRepository.getMedical();
    }

    @Override
    public List<MedicalDeclaration> findAll() {
        return this.iMedicalServiceRepository.findAll();
    }
}
