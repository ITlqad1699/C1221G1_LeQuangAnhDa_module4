package com.codegym.service.impl;

import com.codegym.model.Settings;
import com.codegym.repository.ISettingRepository;
import com.codegym.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    @Autowired
    ISettingRepository iSettingRepository;

    @Override
    public void save(Settings setting) {
        iSettingRepository.save(setting);
    }

    @Override
    public Settings getSetting() {
        return iSettingRepository.getSetting();
    }
}
