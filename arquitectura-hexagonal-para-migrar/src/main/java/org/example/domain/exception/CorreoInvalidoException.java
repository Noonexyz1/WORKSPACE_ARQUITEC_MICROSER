package org.example.domain.exception;

import lombok.Getter;

@Getter
public class CorreoInvalidoException extends RuntimeException {
    private String code;

    public CorreoInvalidoException(String code, String message) {
        super(message);
        this.code = code;
    }
}
