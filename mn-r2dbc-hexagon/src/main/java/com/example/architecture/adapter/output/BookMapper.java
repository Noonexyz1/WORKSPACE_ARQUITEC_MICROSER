package com.example.architecture.adapter.output;

import com.example.application.domain.Book;

import jakarta.inject.Singleton;

@Singleton
public class BookMapper {
    public Book toDomain(BookEntity b) {
        return new Book(b.id(), b.title(), b.pages());
    }
}
