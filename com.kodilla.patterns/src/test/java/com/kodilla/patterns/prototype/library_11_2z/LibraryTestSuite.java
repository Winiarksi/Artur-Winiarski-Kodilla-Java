package com.kodilla.patterns.prototype.library_11_2z;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        // Given
        Library library = new Library("Lista biblioteczna");
        library.getBooks()
                .add(new Book("Opowieści zapisane w naszych genach", "Adam Rutherford", LocalDate.of(2017, 4, 12)));
        library.getBooks().add(new Book("Największa rozpustnica Aleksadrysjka", "Niwierny", LocalDate.of(1112, 4, 10)));
        library.getBooks().add(new Book("Ostatnia walka: moje życie jako lotnika, przemytnika i poszukiwacza przygód", "Jan Zumbach", LocalDate.of(2001, 01, 10)));
        library.getBooks().add(new Book("Africanus, Wojna w Italii", "Santiago Posteguillo", LocalDate.now()));


        //making a shallow copy of object Library
        Library shallowLibrary = null;
        try {
            shallowLibrary = library.shallowCopy();
            shallowLibrary.setName("Lista biblioteczna - shallow");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Lista biblioteczna - deep");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        deepCloneLibrary.getBooks().add(new Book("Od zwierząt do bogów. Krótka historia ludzkości", "Yuval Noah Harari", LocalDate.of(2014, 6, 01)));
        // jak bym chciał usunąć jeden wiersz, to jaki powienien być zapis?

        // Then
        System.out.println("library " + library.getBooks().size());
        System.out.println("shallowLibrary " + shallowLibrary.getBooks().size());
        System.out.println("deepCloneLibrary " + deepCloneLibrary.getBooks().size());
        System.out.println("\n");

        System.out.println(library);
        System.out.println(shallowLibrary);
        System.out.println(deepCloneLibrary);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowLibrary.getBooks());
        Assert.assertNotEquals(shallowLibrary.getBooks(), deepCloneLibrary.getBooks());
    }
}


/*
zawierający test testGetBooks().
W teście stwórz:
1   obiekt biblioteki
2   kilka obiektów książek
3   dodaj je do księgozbioru.
*/