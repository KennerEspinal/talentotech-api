package com.talentotech.energia_api.repositories;

import com.talentotech.energia_api.entities.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyData, Long> {
}
