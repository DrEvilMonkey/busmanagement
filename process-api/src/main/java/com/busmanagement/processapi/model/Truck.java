package com.busmanagement.processapi.model;

public class Truck {

    private Long idCamion;

    private String nombre;
    private String modelo;
    private String marca;
    private int año;
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
