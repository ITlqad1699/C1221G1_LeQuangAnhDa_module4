package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalServiceRepository {

    MedicalDeclaration getMedical();

    List<MedicalDeclaration> findAll();
}
