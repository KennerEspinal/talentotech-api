package com.talentotech.energia_api.services.implementations;

import com.talentotech.energia_api.entities.EnergySource;
import com.talentotech.energia_api.repositories.EnergySourceRepository;
import com.talentotech.energia_api.services.EnergySourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnergySourceImpl implements EnergySourceService {
    @Autowired
    EnergySourceRepository repository;

    @Override
    public EnergySource saveSource(EnergySource energySource) {
        return repository.save(energySource);
    }

    @Override
    public EnergySource updateSource(EnergySource energySource) {
        return repository.save(energySource);
    }

    @Override
    public List<EnergySource> getEnergySources() {
        return repository.findAll();
    }

    @Override
    public Optional<EnergySource> getSourceById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
