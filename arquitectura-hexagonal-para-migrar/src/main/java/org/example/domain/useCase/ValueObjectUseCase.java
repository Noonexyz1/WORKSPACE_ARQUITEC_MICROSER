package org.example.domain.useCase;

//estas interfaces son para que cualquier programador las pueda implementar a su manera
//estas interfaces la van a utilizar como puertos o api
public interface ValueObjectUseCase {
    void validarCampoID(String id);
    void validarCampoCorreo(String email);
}
