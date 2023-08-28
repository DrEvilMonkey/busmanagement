package com.busmanagement.systemapi.controller;

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
//import org.springframework.http.HttpStatus;

import com.busmanagement.systemapi.model.TruckEntity;
import com.busmanagement.systemapi.service.TruckSystemService;

import java.util.List;

@RestController
@RequestMapping("/system/trucks")
public class TruckController {

    @Autowired
    private TruckSystemService truckSystemService;

    @GetMapping
    public List<TruckEntity> getAllTrucks() {
        return truckSystemService.getAllTrucks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TruckEntity> getTruckById(@PathVariable Long id) {
        return ResponseEntity.ok(truckSystemService.getTruckById(id));
    }

    @PostMapping
    public TruckEntity createTruck(@RequestBody TruckEntity truck) {
        return truckSystemService.createTruck(truck);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TruckEntity> updateTruck(@PathVariable Long id, @RequestBody TruckEntity truck) {
        return ResponseEntity.ok(truckSystemService.updateTruck(id, truck));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruck(@PathVariable Long id) {
        truckSystemService.deleteTruck(id);
        return ResponseEntity.noContent().build();
    }

}
