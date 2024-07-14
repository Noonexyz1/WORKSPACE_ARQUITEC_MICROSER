package org.example.domain.valueObject;

public class AbogadoEmail {
    private String email;

    public AbogadoEmail(String email) {
        this.email = email;
        validarCampo();
    }

    private void validarCampo() {
        if (!email.contains("@")) {
            throw new RuntimeException("El formato del correo debe ser valido");
        }
    }
}
