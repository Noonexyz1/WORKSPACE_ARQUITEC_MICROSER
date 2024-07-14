package org.example.domain.valueObject;

public class AbogadoId {
    private String id;

    public AbogadoId(String id) {
        this.id = id;
        validarCampo();
    }

    public void validarCampo() {
        if (id.length() <= 5) {
            throw new RuntimeException("El ID debe ser una logitud mayor a 5");
        }
    }
}
