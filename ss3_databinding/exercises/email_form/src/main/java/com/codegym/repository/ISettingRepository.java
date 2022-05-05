package com.codegym.repository;

import com.codegym.model.Settings;

public interface ISettingRepository {
    void save(Settings setting);

    Settings getSetting();
}
