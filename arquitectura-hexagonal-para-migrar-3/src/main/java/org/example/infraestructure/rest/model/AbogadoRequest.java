package org.example.infraestructure.rest.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbogadoRequest {
    private int idRequest;
    private String nombreRequest;
    private String emailRequest;
}
