package org.example.domain;

import java.util.List;

public interface AbogadoUseCase {
    List<String> listarCasos();
    String encontrarCaso();
    void guardarNuevoCaso();
}
