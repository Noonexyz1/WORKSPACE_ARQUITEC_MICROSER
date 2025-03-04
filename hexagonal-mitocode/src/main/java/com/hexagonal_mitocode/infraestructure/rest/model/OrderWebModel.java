package com.hexagonal_mitocode.infraestructure.rest.model;

public record OrderWebModel(
        Long id,
        String product,
        Long amount
) { }
