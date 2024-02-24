package com.example.architecture.port.output;

import com.example.application.domain.Book;
import reactor.core.publisher.Flux;

public interface ListBooksPort {
    Flux<Book> findAll();
}
