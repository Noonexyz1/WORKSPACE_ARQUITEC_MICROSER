package com.example.architecture.adapter.output;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@R2dbcRepository(dialect = Dialect.POSTGRES)
public interface AuthorDetailRepository
        extends ReactorCrudRepository<AuthorDetailEntity, AuthorDetailId> {
}
