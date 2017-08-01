package com.kodilla.testing.library6_6;

import java.util.List;

public interface LibraryDatabase {
    // Wypisuje książki o tytule zaczynającym się na tytuł Fragment
    List<Book>listBooksWithCondition(String titleFragment); // oczekuje listy

    // książki listowe zapożyczone przez użytkowników biblioteki
    List<Book>listBooksInHandsOf(LibraryUser libraryUser); // oczekuje obiektu

    // staram się wynająć książkę dla LibraryUser zwraca prawdę, gdy sukces
    // i zwraca fałsz, gdy książka jest niedostępna do wynajęcia
    boolean rentABook(LibraryUser libraryUser, Book book);

    // zwróć wszystkie książki zapożyczone przez bibliotekęUser do biblioteki
    // zwraca liczbę powróconych książek
    int returnBooks(LibraryUser libraryUser);
}
