package com.example


import com.example.application.domain.Book

import com.example.architecture.adapter.output.BookEntity
import com.example.architecture.adapter.output.BookRepository
import groovy.util.logging.Slf4j
import io.micronaut.data.r2dbc.operations.R2dbcOperations
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest

//import org.testcontainers.containers.MySQLContainer
//import org.testcontainers.utility.DockerImageName
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import spock.lang.Shared
import spock.lang.Specification

import jakarta.inject.Inject

@Slf4j
@MicronautTest
class BookControllerBlockingSpec extends Specification {

    @Inject BookClient bookClient

    @Shared @Inject R2dbcOperations operations
    @Shared @Inject BookRepository bookRepository

    def setupSpec() {
       // tag::programmatic-tx[]
       Mono.from(operations.withTransaction(status ->
                Flux.from(bookRepository.saveAll([
                        new BookEntity("The Stand", 1000),
                        new BookEntity("The Shining", 400),
                        new BookEntity("Along Came a Spider", 300),
                        new BookEntity("Jurassic Park", 300),
                        new BookEntity("Disclosure", 400)                        ]))
        )).log().subscribe((BookEntity book) -> log.info("{} {}",book.id, book.title))
        // end::programmatic-tx[]
    }

    void "test list books"() {
        when:
        List<Book> list = bookClient.list()

        then:
        list.size() == 5
    }

    @Client("/books")
    static interface BookClient {
        @Get("/")
        List<Book> list()
    }
}