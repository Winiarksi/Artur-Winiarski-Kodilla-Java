package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian(){

        Set<OldBook> oldBooksList = new HashSet<>();
        oldBooksList.add(new OldBook("Ursula K.LeGuin", "The Tombs of Atuan", 1971, "X1031"));
        oldBooksList.add(new OldBook("Jan Chryzostom Pasek", "Pamiętniki", 2010, "X1045"));
        oldBooksList.add(new OldBook("Jaś Fasola", "Miłosne przygody Koziołka Matołka", 1997, "X1020"));

        MedianAdapter medianAdapter = new MedianAdapter();
        int a = medianAdapter.publicationYearMedian(oldBooksList);

        System.out.println("\nA: " + a);
    }

}