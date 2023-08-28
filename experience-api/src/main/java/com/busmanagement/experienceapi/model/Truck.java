package com.busmanagement.experienceapi.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;

public class Truck {
    private Long idCamion;

    @NotBlank(message = "Nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "Modelo no puede estar vacio")
    private String modelo;

    @NotBlank(message = "Marca no puede estar vacio")
    private String marca;

    @NotNull(message = "Año no puede estar vacio")
    @Positive(message = "Año debe ser positivo")
    @Min(value = 1900, message = "Año debe ser mayor a 1900")
    private int año;

    @NotNull(message = "Status no puede estar vacio")
    @Pattern(regexp = "^(?i)(activo|inactivo|pendiente)$", message = "Status debe ser Activo, Inactivo o Pendiente")
    private String status;

    // Parameterized constructor for convenience
    public Truck(String name, String modelo, String make, int year, String status) {
        this.nombre = name;
        this.modelo = modelo;
        this.marca = make;
        this.año = year;
        this.status = status;
    }

    // Getters and setters

    public Long getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(Long idCamion) {
        this.idCamion = idCamion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMake(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
