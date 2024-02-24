package com.example.architecture.adapter.input;

import com.example.application.service.BookService;
import com.example.architecture.adapter.output.BookRepository;
import com.example.application.domain.Book;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Flux;

@Controller("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get("/")
    Flux<Book> all() {
        return bookService.findAll();
    }
}
