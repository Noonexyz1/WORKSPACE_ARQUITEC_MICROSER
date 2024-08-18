package org.example.infraestructure.rest.mapper;

import org.example.domain.model.Abogado;
import org.example.infraestructure.rest.model.AbogadoRequest;
import org.springframework.stereotype.Component;

@Component
public class AbogadoInfraMapper {

    public Abogado abogadoRequestToAbogado(AbogadoRequest abogadoRequest) {
        return Abogado.builder()
                .id(abogadoRequest.getIdRequest())
                .nombre(abogadoRequest.getNombreRequest())
                .email(abogadoRequest.getEmailRequest())
                .build();
    }

    public AbogadoRequest abogadoToAbogadoRequest(Abogado abogado) {
        return AbogadoRequest.builder()
                .idRequest(abogado.getId())
                .nombreRequest(abogado.getNombre())
                .emailRequest(abogado.getEmail())
                .build();
    }
}
