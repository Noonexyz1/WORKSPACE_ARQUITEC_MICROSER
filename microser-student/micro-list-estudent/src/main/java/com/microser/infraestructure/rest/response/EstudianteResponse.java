package com.microser.infraestructure.rest.response;

public class EstudianteResponse {
    private Long id;
    private String nombre;
    private String direccion;


    public EstudianteResponse(Long id, String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public EstudianteResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
