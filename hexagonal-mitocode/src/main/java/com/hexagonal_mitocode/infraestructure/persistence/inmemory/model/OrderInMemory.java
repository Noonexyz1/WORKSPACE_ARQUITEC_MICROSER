package com.hexagonal_mitocode.infraestructure.persistence.inmemory.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderInMemory {
    private Long id;
    private String product;
    private Long amount;
}
