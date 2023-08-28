package com.busmanagement.systemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busmanagement.systemapi.exception.TruckNotFoundException;
import com.busmanagement.systemapi.model.TruckEntity;
import com.busmanagement.systemapi.repository.TruckRepository;

import java.util.List;

@Service
public class TruckSystemService {

    @Autowired
    private TruckRepository truckRepository;

    public List<TruckEntity> getAllTrucks() {
        return truckRepository.findAll();
    }

    public TruckEntity getTruckById(Long id) {
        return truckRepository.findById(id).orElseThrow(() -> new TruckNotFoundException(id));
    }

    public TruckEntity createTruck(TruckEntity truck) {
        return truckRepository.save(truck);
    }

    public TruckEntity updateTruck(Long id, TruckEntity truck) {
        if (truckRepository.existsById(id)) {
            truck.setIdCamion(id);
            return truckRepository.save(truck);
        } else {
            throw new TruckNotFoundException(id);
        }
    }

    public void deleteTruck(Long id) {
        if (truckRepository.existsById(id)) {
            truckRepository.deleteById(id);
        } else {
            throw new TruckNotFoundException(id);
        }
    }

}
