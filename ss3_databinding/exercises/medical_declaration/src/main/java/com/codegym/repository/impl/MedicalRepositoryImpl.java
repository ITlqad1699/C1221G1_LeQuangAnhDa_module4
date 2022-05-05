package com.codegym.repository.impl;

import com.codegym.model.MedicalDeclaration;
import com.codegym.repository.IMedicalServiceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MedicalRepositoryImpl implements IMedicalServiceRepository {
    private static Map<Integer,MedicalDeclaration> medicalDeclarationMap = new HashMap<>();
    private static MedicalDeclaration medicalDeclaration = new MedicalDeclaration();
    @Override
    public MedicalDeclaration getMedical() {
        return this.medicalDeclaration;
    }

    @Override
    public List<MedicalDeclaration> findAll() {
        return new ArrayList<>(this.medicalDeclarationMap.values());
    }
}
