package org.example.domain.enums;

import lombok.Getter;

@Getter
public enum CodigoValueException {
    CORREO_INVALIDO("5000", "Correo invalido"),
    ID_INVALIDO("5001", "Id invalido");

    private String code;
    private String message;

    CodigoValueException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
