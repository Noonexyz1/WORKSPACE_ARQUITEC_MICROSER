package com.example.architecture.port.input;

import com.example.application.domain.Book;
import reactor.core.publisher.Flux;

public interface ListBooksUseCase {
    Flux<Book> findAll();
}
