package org.example.application.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbogadoDTO {
    private int id;
    private String nombre;
    private String email;
}
