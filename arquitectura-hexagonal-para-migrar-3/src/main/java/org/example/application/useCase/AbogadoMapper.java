package org.example.application.useCase;

import org.example.application.dto.AbogadoDTO;
import org.example.domain.model.Abogado;

public interface AbogadoMapper {
    Abogado abogadoDTOToAbogado(AbogadoDTO abogadoDTO);
    AbogadoDTO abogadoToAbogadoDTO(Abogado abogado);
}
