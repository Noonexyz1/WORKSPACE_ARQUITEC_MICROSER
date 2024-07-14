package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.valueObject.AbogadoEmail;
import org.example.domain.valueObject.AbogadoId;
import org.example.domain.valueObject.AbogadoNombre;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Abogado {
    private AbogadoId id;
    private AbogadoNombre nombre;
    private AbogadoEmail email;
}

