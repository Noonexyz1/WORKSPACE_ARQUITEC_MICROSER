package com.microser.infraestructure.rest.response;

public class EstudianteRequest {
    private String nombre;
    private String direccion;


    public EstudianteRequest(Long id, String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public EstudianteRequest() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
