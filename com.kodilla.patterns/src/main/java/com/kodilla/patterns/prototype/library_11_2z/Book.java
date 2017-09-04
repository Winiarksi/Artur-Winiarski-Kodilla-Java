package com.kodilla.patterns.prototype.library_11_2z;

import java.time.LocalDate;

public final class Book {
    String title;
    String author;
    LocalDate publicationDate;

    public Book( String title, String author, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", " +
                author + ", " + publicationDate + '.';
    }
}