package org.example.domain.useCase;

import java.util.List;

//estas interfaces son para que cualquier programador las pueda implementar a su manera
//estas interfaces la van a utilizar como puertos o api
public interface AbogadoUseCase {
    List<String> listarCasos();
    String encontrarCaso(Long index);
    void guardarNuevoCaso(String nuevoCaso);
}
