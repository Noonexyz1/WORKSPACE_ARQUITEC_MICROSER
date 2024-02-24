package com.example.application.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record Book(
    Long id,
    String title,
    int pages){
}
