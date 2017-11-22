package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.NewBook;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, NewBook> books) { // srednia
        Statistics average = new Statistics();
        return average.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, NewBook> books) {
        Statistics median = new Statistics();
        return median.medianPublicationYear(books);
    }
//    W katalogu src/main/java w pakiecie com.kodilla.patterns2.adapter.bookclassifier utwórz klasę MedianAdaptee, która implementuje interfejs BookStatistics oraz używa obiektu klasy Statistics do wykonania obliczeń
}
