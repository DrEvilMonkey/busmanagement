package com.busmanagement.experienceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.busmanagement.experienceapi.client.ProcessApiClient;
import com.busmanagement.experienceapi.model.Truck;

@RestController
@RequestMapping("/api/v1/camion")
public class TruckExperienceController {
    @Autowired
    private ProcessApiClient processApiClient;

    @GetMapping
    public List<Truck> getAllTrucks() {
        return processApiClient.getAllTrucks();
    }

    @GetMapping("/{id}")
    public Truck getTruckById(@PathVariable Long id) {
        return processApiClient.getTruckById(id);
    }

    @PostMapping
    public Truck createTruck(@Valid @RequestBody Truck truck) {
        return processApiClient.createTruck(truck);
    }

    @PutMapping("/{id}")
    public Truck updateTruck(@PathVariable Long id, @RequestBody Truck truck) {
        return processApiClient.updateTruck(id, truck);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruck(@PathVariable Long id) {
        processApiClient.deleteTruck(id);
        return ResponseEntity.noContent().build();
    }
}
