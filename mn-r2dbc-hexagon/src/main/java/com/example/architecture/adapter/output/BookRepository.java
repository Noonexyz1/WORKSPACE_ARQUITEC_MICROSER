package com.example.architecture.adapter.output;

import com.example.application.domain.Book;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@R2dbcRepository(dialect = Dialect.POSTGRES)
public interface BookRepository extends ReactiveStreamsCrudRepository<BookEntity, Long> {

    @NonNull
    @Override
    Flux<BookEntity> findAll();

    // tag::mandatory[]
    @NonNull
    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    <S extends BookEntity> Publisher<S> save(@NonNull @Valid @NotNull S entity);

    @NonNull
    @Override
    @Transactional(Transactional.TxType.MANDATORY)
    <S extends BookEntity> Publisher<S> saveAll(@NonNull @Valid @NotNull Iterable<S> entities);
    // end::mandatory[]
}
