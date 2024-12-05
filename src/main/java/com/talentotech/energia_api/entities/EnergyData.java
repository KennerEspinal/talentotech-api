package com.talentotech.energia_api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "energy_data")
public class EnergyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_id", nullable = false)
    @JsonProperty("energy_source")
    private EnergySource energySource;

    @JsonProperty("region")
    private String region;

    @JsonProperty("year")
    private int year;

    @JsonProperty("production")
    private double production;

    @JsonProperty("consumption")
    private double consumption;
}
