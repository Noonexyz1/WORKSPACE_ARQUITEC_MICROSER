package org.example.infraestructure.rest.mapper;

import org.example.application.dto.AbogadoDTO;
import org.example.infraestructure.rest.model.AbogadoRequest;
import org.springframework.stereotype.Component;

@Component
public class AbogadoInfraMapper {

    public AbogadoDTO abogadoRequestToAbogadoDTO(AbogadoRequest abogadoRequest) {
        return AbogadoDTO.builder()
                .id(abogadoRequest.getIdRequest())
                .nombre(abogadoRequest.getNombreRequest())
                .email(abogadoRequest.getEmailRequest())
                .build();
    }

    public AbogadoRequest abogadoDTOToAbogadoRequest(AbogadoDTO abogadoDTO) {
        return AbogadoRequest.builder()
                .idRequest(abogadoDTO.getId())
                .nombreRequest(abogadoDTO.getNombre())
                .emailRequest(abogadoDTO.getEmail())
                .build();
    }
}
