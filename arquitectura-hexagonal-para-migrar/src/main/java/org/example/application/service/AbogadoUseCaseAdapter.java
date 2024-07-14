package org.example.application.service;

//podemos observar que estamos usando el dominio, y el dominio no esta utilizando cosas de la capa superior
import org.example.domain.useCase.AbogadoUseCase;

import java.util.List;

public class AbogadoUseCaseAdapter implements AbogadoService {

    private AbogadoUseCase abogadoUseCase;

    @Override
    public List<String> listarCasosService() {
        //demas logica
        return abogadoUseCase.listarCasos();
    }

    @Override
    public String encontrarCasoService(Long index) {
        //demas logica
        return abogadoUseCase.encontrarCaso(index);
    }

    @Override
    public void guardarNuevoCasoService(String caso) {
        //demas logica
        abogadoUseCase.guardarNuevoCaso(caso);
    }
}
