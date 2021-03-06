package com.kodilla.testing.library6_6;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book>listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);

        for ( int i = 0; i < resultList.size(); i++){
            System.out.println(resultList.get(i));
            System.out.println(libraryUser);
        }

        return resultList;
    }
}
