package com.hexagonal_mitocode.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Order {
    private Long id;
    private String product;
    private Long amount;
}
