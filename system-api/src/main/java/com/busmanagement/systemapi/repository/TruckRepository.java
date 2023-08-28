package com.busmanagement.systemapi.repository;

import com.busmanagement.systemapi.model.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
}