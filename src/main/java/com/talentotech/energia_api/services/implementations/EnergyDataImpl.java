package com.talentotech.energia_api.services.implementations;

import com.talentotech.energia_api.entities.EnergyData;
import com.talentotech.energia_api.repositories.EnergyDataRepository;
import com.talentotech.energia_api.services.EnergyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnergyDataImpl implements EnergyDataService {
    @Autowired
    EnergyDataRepository repository;

    @Override
    public EnergyData saveData(EnergyData energydata) {
        return repository.save(energydata);
    }

    @Override
    public EnergyData updateData(EnergyData energyData) {
        return repository.save(energyData);
    }

    @Override
    public List<EnergyData> getEnergyDatas() {
        return repository.findAll();
    }

    @Override
    public Optional<EnergyData> getDataById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
