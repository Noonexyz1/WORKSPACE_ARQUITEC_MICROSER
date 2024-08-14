package org.example.application.mapper;

import org.example.application.dto.AbogadoDTO;
import org.example.application.useCase.AbogadoMapper;
import org.example.domain.model.Abogado;

public class AbogadoImpMapper implements AbogadoMapper {

    @Override
    public Abogado abogadoDTOToAbogado(AbogadoDTO abogadoDTO) {
        return new Abogado(abogadoDTO.getId(), abogadoDTO.getNombre(), abogadoDTO.getEmail());
    }

    @Override
    public AbogadoDTO abogadoToAbogadoDTO(Abogado abogado) {
        return new AbogadoDTO(abogado.getId(), abogado.getNombre(), abogado.getEmail());
    }
}
