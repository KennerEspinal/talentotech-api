package com.talentotech.energia_api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "energy_source")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnergySource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @JsonProperty("name")
    @Column(nullable = false)
    private String name;

    @JsonProperty("description")
    @Column(nullable = false)
    private String description;
}
