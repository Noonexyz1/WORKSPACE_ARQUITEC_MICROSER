package org.example.application.implement;

import org.example.domain.useCase.AbogadoUseCase;

import java.util.List;

public class AbogadoUseCaseImpl implements AbogadoUseCase {

    private List<String> listaCasos;

    @Override
    public List<String> listarCasos() {
        listaCasos = List.of("Caso1", "Caso2", "Caso3", "Caso4", "Caso5", "Caso6");
        return listaCasos;
    }

    @Override
    public String encontrarCaso(Long index) {
        return listaCasos.get(index.intValue());
    }

    @Override
    public void guardarNuevoCaso(String nuevoCaso) {
        listaCasos.add(nuevoCaso);
    }
}
