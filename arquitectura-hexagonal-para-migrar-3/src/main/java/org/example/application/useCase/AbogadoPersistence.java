package org.example.application.useCase;

import org.example.application.dto.AbogadoDTO;

import java.util.List;

//indicar las operaciones de persistencia necesarios que cada implementacion debe tener
//Esto es una interfaz adicional de application
public interface AbogadoPersistence {
    List<AbogadoDTO> getAllAbogados();
    void saveNewAbogado(AbogadoDTO nuevoAbogado);
}
