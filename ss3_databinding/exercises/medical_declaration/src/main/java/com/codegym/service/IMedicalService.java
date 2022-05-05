package com.codegym.service;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalService {
    MedicalDeclaration getMedical();

    List<MedicalDeclaration> findAll();
}
