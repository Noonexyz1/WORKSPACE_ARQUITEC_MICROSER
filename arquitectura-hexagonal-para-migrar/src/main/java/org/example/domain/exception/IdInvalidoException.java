package org.example.domain.exception;

import lombok.Getter;

@Getter
public class IdInvalidoException extends RuntimeException {
    private String code;

    public IdInvalidoException(String code, String message) {
        super(message);
        this.code = code;
    }
}
