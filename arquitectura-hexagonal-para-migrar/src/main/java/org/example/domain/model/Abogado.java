package org.example.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.valueObject.AbogadoEmail;
import org.example.domain.valueObject.AbogadoId;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Abogado {
    private AbogadoId id;
    private String nombre;
    private AbogadoEmail email;
}

