package com.talentotech.energia_api.controllers;

import com.talentotech.energia_api.entities.EnergyData;
import com.talentotech.energia_api.services.implementations.EnergyDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/energy-data")
public class EnergyDataController {

    @Autowired
    private EnergyDataImpl service;

    @GetMapping
    public ResponseEntity<List<EnergyData>> getAllData() {
        List<EnergyData> dataList = service.getEnergyDatas();
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EnergyData> saveData(@RequestBody EnergyData energyData) {
        try {
            EnergyData savedData = service.saveData(energyData);
            return new ResponseEntity<>(savedData, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<EnergyData> updateData(@RequestBody EnergyData energyData) {
        try {
            EnergyData updatedData = service.updateData(energyData);
            return new ResponseEntity<>(updatedData, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnergyData> getDataById(@PathVariable Long id) {
        Optional<EnergyData> data = service.getDataById(id);
        if (data.isPresent()) {
            return new ResponseEntity<>(data.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar un registro por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
        Optional<EnergyData> data = service.getDataById(id);
        if (data.isPresent()) {
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
