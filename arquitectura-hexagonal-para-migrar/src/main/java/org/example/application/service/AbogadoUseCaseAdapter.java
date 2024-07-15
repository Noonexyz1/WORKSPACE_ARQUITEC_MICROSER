package org.example.application.service;

//podemos observar que estamos usando el dominio, y el dominio no esta utilizando cosas de la capa superior
import org.example.application.implement.AbogadoUseCaseImpl;
import org.example.domain.useCase.AbogadoUseCase;

import java.util.List;

public class AbogadoUseCaseAdapter implements AbogadoService {

    @Override
    public List<String> listarCasosService() {
        //demas logica
        AbogadoUseCase abogadoUseCase = new AbogadoUseCaseImpl();
        return abogadoUseCase.listarCasos();
    }

    @Override
    public String encontrarCasoService(Long index) {
        //demas logica
        AbogadoUseCase abogadoUseCase = new AbogadoUseCaseImpl();
        return abogadoUseCase.encontrarCaso(index);
    }

    @Override
    public void guardarNuevoCasoService(String caso) {
        //demas logica
        AbogadoUseCase abogadoUseCase = new AbogadoUseCaseImpl();
        abogadoUseCase.guardarNuevoCaso(caso);
    }
}
