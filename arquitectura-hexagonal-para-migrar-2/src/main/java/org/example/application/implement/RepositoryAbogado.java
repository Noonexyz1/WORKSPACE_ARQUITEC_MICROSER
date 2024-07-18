package org.example.application.implement;

import java.util.List;

//indicar las operaciones de persistencia necesarios que cada implementacion debe tener
//Esto es una interfaz adicional de application
public interface RepositoryAbogado {
    List<String> getAllAbogados();
    void saveNewAbogado(String nombre);
}
