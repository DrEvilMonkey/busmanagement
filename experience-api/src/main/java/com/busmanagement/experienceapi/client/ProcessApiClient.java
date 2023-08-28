package com.busmanagement.experienceapi.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.busmanagement.experienceapi.model.Truck;

@FeignClient(name = "process-api")
public interface ProcessApiClient {
    // Get all trucks
    @GetMapping("/process/trucks")
    List<Truck> getAllTrucks();

    // Get a single truck by its ID
    @GetMapping("/process/trucks/{id}")
    Truck getTruckById(@PathVariable Long id);

    // Create a new truck
    @PostMapping("/process/trucks")
    Truck createTruck(@RequestBody Truck truck);

    // Update an existing truck
    @PutMapping("/process/trucks/{id}")
    Truck updateTruck(@PathVariable Long id, @RequestBody Truck truck);

    // Delete a truck by its ID
    @DeleteMapping("/process/trucks/{id}")
    void deleteTruck(@PathVariable Long id);
}
