package com.talentotech.energia_api.services;

import com.talentotech.energia_api.entities.EnergySource;

import java.util.List;
import java.util.Optional;

public interface EnergySourceService {
    EnergySource saveSource(EnergySource energySource);

    EnergySource updateSource(EnergySource energySource);

    List<EnergySource> getEnergySources();

    Optional<EnergySource> getSourceById(Long id);

    void delete(Long id);
}
