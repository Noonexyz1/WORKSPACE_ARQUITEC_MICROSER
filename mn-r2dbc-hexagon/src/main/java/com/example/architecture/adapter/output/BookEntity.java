package com.example.architecture.adapter.output;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity("book")
public record BookEntity(
    @Id
    @GeneratedValue
    Long id,
    String title,
    int pages){
            BookEntity(String title, int pages){
                this(null,title,pages);
            }
}
