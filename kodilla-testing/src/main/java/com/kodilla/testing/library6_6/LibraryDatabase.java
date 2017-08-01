package com.kodilla.testing.library6_6;

import java.util.List;

public interface LibraryDatabase {
    // Wypisuje książki o tytule zaczynającym się na tytuł Fragment
    List<Book>listBooksWithCondition(String titleFragment); // oczekuje listy

    // książki listowe zapożyczone przez użytkowników biblioteki
    List<Book>listBooksInHandsOf(LibraryUser libraryUser); // oczekuje obiektu

    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
