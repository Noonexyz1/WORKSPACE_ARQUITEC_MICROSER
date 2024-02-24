package com.example.architecture.adapter.output;


import io.micronaut.data.annotation.*;

@MappedEntity("author")
public class AuthorEntity {
    @GeneratedValue
    @Id
    private Long id;
    private final String name;

    public AuthorEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}