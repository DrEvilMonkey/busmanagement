package com.busmanagement.processapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busmanagement.processapi.client.SystemApiClient;
import com.busmanagement.processapi.model.Truck;

@Service
public class TruckProcessService {
    @Autowired
    private SystemApiClient systemApiClient;

    public List<Truck> getAllTrucks() {
        return systemApiClient.getAllTrucks();
    }

    public Truck getTruckById(Long id) {
        return systemApiClient.getTruckById(id);
    }

    public Truck createTruck(Truck truck) {
        return systemApiClient.createTruck(truck);
    }

    public Truck updateTruck(Long id, Truck truck) {
        return systemApiClient.updateTruck(id, truck);
    }

    public void deleteTruck(Long id) {
        systemApiClient.deleteTruck(id);
    }

}
