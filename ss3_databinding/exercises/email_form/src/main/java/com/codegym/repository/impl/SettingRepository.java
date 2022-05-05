package com.codegym.repository.impl;

import com.codegym.model.Settings;
import com.codegym.repository.ISettingRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SettingRepository implements ISettingRepository {
             private Settings settings = new Settings();

    @Override
    public void save(Settings setting) {
        this.settings = setting;
    }

    @Override
    public Settings getSetting() {
        return this.settings;
    }
}
