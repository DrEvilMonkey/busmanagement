package com.busmanagement.processapi.exception;

public class TruckNotFoundException extends RuntimeException {
    public TruckNotFoundException(Long id) {
        super("Camion con ID " + id + " no encontrado");
    }
}