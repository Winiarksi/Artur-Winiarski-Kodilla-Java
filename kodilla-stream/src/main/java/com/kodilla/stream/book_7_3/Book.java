package com.kodilla.stream.book_7_3;

public final class Book {
    private final String author;
    private final String title;
    private final String signature;
    private final int yearOfPublication;

    public Book(final String author, final String title,
                final int yearOfPublication,
                final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}