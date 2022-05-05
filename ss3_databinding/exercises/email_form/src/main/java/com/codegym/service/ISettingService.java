package com.codegym.service;

import com.codegym.model.Settings;

public interface ISettingService {
    void save(Settings setting);

    Settings getSetting();
}
