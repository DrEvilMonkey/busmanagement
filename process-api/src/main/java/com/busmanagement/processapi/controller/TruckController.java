package com.busmanagement.processapi.controller;

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

import com.busmanagement.processapi.model.Truck;
import com.busmanagement.processapi.service.TruckProcessService;

@RestController
@RequestMapping("/process/trucks")
public class TruckController {

    @Autowired
    private TruckProcessService truckProcessService;

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckProcessService.getAllTrucks();
    }

    @GetMapping("/{id}")
    public Truck getTruckById(@PathVariable Long id) {
        return truckProcessService.getTruckById(id);
    }

    @PostMapping
    public Truck createTruck(@RequestBody Truck truck) {
        return truckProcessService.createTruck(truck);
    }

    @PutMapping("/{id}")
    public Truck updateTruck(@PathVariable Long id, @RequestBody Truck truck) {
        return truckProcessService.updateTruck(id, truck);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruck(@PathVariable Long id) {
        truckProcessService.deleteTruck(id);
        return ResponseEntity.noContent().build();
    }

}
