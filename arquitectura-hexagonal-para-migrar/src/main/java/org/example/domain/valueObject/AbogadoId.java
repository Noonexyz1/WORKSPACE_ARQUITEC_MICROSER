package org.example.domain.valueObject;

import org.example.domain.useCase.ValueObjectUseCase;

public class AbogadoId {
    private String id;

    public AbogadoId(String id, ValueObjectUseCase valueObjectUseCase) {
        valueObjectUseCase.validarCampoID(id);
        this.id = id;
    }
}
