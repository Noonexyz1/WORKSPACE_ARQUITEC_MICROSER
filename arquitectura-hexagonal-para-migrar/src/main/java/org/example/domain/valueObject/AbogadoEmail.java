package org.example.domain.valueObject;

import org.example.domain.useCase.ValueObjectUseCase;

public class AbogadoEmail {
    private String email;

    public AbogadoEmail(String email, ValueObjectUseCase valueObjectUseCase) {
        valueObjectUseCase.validarCampoCorreo(email);
        this.email = email;
    }
}
