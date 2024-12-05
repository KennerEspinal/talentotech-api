package com.talentotech.energia_api.repositories;

import com.talentotech.energia_api.entities.EnergySource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergySourceRepository extends JpaRepository<EnergySource, Long> {
}
