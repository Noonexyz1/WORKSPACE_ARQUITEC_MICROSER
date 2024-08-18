package org.example.application.useCase;

import org.example.domain.model.Abogado;

import java.util.List;

//indicar las operaciones de persistencia necesarios que cada implementacion debe tener
//Esto es una interfaz adicional de application
public interface AbogadoPersistence {
    List<Abogado> getAllAbogados();
    void saveNewAbogado(Abogado nuevoAbogado);
}
