package org.example.application.implement;

import org.example.domain.useCase.AbogadoUseCase;

import java.util.ArrayList;
import java.util.List;

public class AbogadoUseCaseImpl implements AbogadoUseCase {

    private List<String> listaCasos;

    public AbogadoUseCaseImpl() {
        this.listaCasos = new ArrayList<>();
        listaCasos.add("Caso1");
        listaCasos.add("Caso2");
        listaCasos.add("Caso3");
        listaCasos.add("Caso4");
        listaCasos.add("Caso5");
    }

    @Override
    public List<String> listarCasos() {
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
