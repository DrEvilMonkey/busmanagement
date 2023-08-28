package com.busmanagement.processapi.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.busmanagement.processapi.model.Truck;

@FeignClient(name = "system-api")
public interface SystemApiClient {
    @GetMapping("/system/trucks")
    List<Truck> getAllTrucks();

    @GetMapping("/system/trucks/{id}")
    Truck getTruckById(@PathVariable Long id);

    @PostMapping("/system/trucks")
    Truck createTruck(@RequestBody Truck truck);

    @PutMapping("/system/trucks/{id}")
    Truck updateTruck(@PathVariable Long id, @RequestBody Truck truck);

    @DeleteMapping("/system/trucks/{id}")
    void deleteTruck(@PathVariable Long id);

}
