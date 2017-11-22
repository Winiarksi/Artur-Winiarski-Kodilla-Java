package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.NewBook;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<OldBook> oldBookSet) {
        Map<BookSignature, NewBook> books = new HashMap<>();

        for (OldBook od : oldBookSet) {
           books.put(new BookSignature(od.getSignature()), new NewBook(od.getAuthor(), od.getTitle(), od.getPublicationYear()));
        }
        System.out.println(books.toString());
        return averagePublicationYear(books);
    }
}
