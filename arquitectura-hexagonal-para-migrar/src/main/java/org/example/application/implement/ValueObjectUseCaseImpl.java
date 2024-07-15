package org.example.application.implement;

//podemos observar que estamos usando el dominio, y el dominio no esta utilizando cosas de la capa superior
import org.example.domain.exception.CorreoInvalidoException;
import org.example.domain.exception.IdInvalidoException;
import org.example.domain.useCase.ValueObjectUseCase;

import static org.example.domain.enums.CodigoValueException.CORREO_INVALIDO;
import static org.example.domain.enums.CodigoValueException.ID_INVALIDO;

public class ValueObjectUseCaseImpl implements ValueObjectUseCase {

    @Override
    public void validarCampoID(String id) {
        if (id.length() < 5) {
            String code = ID_INVALIDO.getCode();
            String message = ID_INVALIDO.getMessage();
            throw new IdInvalidoException(code, message);
        }
    }

    @Override
    public void validarCampoCorreo(String email) {
        if (!email.contains("@")) {
            String code = CORREO_INVALIDO.getCode();
            String message = CORREO_INVALIDO.getMessage();
            throw new CorreoInvalidoException(code, message);
        }
    }
}
