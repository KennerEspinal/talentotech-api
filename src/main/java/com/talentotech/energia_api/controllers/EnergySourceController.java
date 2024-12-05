package com.talentotech.energia_api.controllers;

import com.talentotech.energia_api.entities.EnergySource;
import com.talentotech.energia_api.services.implementations.EnergySourceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/energy-sources")
public class EnergySourceController {
    @Autowired
    EnergySourceImpl service;

    @GetMapping
    public ResponseEntity<List<EnergySource>> getSources(){
        return new ResponseEntity<>(service.getEnergySources(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EnergySource> saveSource(@RequestBody EnergySource energySource){
        try {
            EnergySource savedSource = service.saveSource(energySource);
            return new ResponseEntity<>(savedSource, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<EnergySource> updateSource(@RequestBody EnergySource energySource){
        try {
            EnergySource savedSource = service.saveSource(energySource);
            return new ResponseEntity<>(savedSource, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnergySource> getById(@PathVariable Long id){
        Optional<EnergySource> source = service.getSourceById(id);
        if(source.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(source.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSource(@PathVariable Long id){
        Optional<EnergySource> source = service.getSourceById(id);
        if(source.isPresent()){
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
