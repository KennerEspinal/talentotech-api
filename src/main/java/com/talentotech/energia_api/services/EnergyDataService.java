package com.talentotech.energia_api.services;


import com.talentotech.energia_api.entities.EnergyData;

import java.util.List;
import java.util.Optional;

public interface EnergyDataService {
    EnergyData saveData(EnergyData energydata);

    EnergyData updateData(EnergyData energyData);

    List<EnergyData> getEnergyDatas();

    Optional<EnergyData> getDataById(Long id);

    void deleteById(Long id);
}
