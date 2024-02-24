package com.example.architecture.adapter.output;

import com.example.application.domain.Book;
import com.example.architecture.port.output.ListBooksPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import jakarta.inject.Singleton;

@Singleton
public class BookPersistenceAdapter implements ListBooksPort {

    private static final Logger LOG = LoggerFactory.getLogger(BookPersistenceAdapter.class);

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final AuthorDetailRepository authorDetailRepository;

    public BookPersistenceAdapter(BookRepository bookRepository, BookMapper bookMapper, AuthorDetailRepository authorDetailRepository) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.authorDetailRepository = authorDetailRepository;
    }

    @Override
    public Flux<Book> findAll() {
        Mono.from(authorDetailRepository.count())
                .doOnSuccess( reg -> LOG.info("Count Detail: {}", reg))
                .subscribe();

        return bookRepository.findAll()
                .map( b -> bookMapper.toDomain(b));
    }
}
