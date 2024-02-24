package com.example.application.service;

import com.example.application.domain.Book;
import com.example.architecture.adapter.output.BookRepository;
import com.example.architecture.port.input.ListBooksUseCase;
import com.example.architecture.port.output.ListBooksPort;
import reactor.core.publisher.Flux;

import jakarta.inject.Singleton;

@Singleton
public class BookService implements ListBooksUseCase {

    private final ListBooksPort listBookPort;

    public BookService(ListBooksPort listBookPort) {
        this.listBookPort = listBookPort;
    }

    @Override
    public Flux<Book> findAll() {
        return listBookPort.findAll();
    }
}
