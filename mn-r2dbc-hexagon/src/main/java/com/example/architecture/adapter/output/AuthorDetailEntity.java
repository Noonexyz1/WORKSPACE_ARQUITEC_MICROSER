package com.example.architecture.adapter.output;

import io.micronaut.data.annotation.*;

@MappedEntity("author_detail")
public class AuthorDetailEntity {
    @EmbeddedId
    private AuthorDetailId authorDetailId;

    public AuthorDetailEntity(AuthorDetailId authorDetailId) {
        this.authorDetailId = authorDetailId;
    }

    public AuthorDetailId getAuthorDetailId() {
        return authorDetailId;
    }
}

@Embeddable
class AuthorDetailId {
    @MappedProperty("author_id")
    private final Long authorId;
    @MappedProperty("book_id")
    private final Long bookId;

    public AuthorDetailId(Long authorId, Long bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public Long getBookId() {
        return bookId;
    }
}