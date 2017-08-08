package com.kodilla.stream.array_7_5z;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
// Test powinien przygotować tablicę z przykładowymi wartościami typu int

        ArrayOperations arrayOperations;

   /*         int[] tablica = new int[10];
            for (int i = 0; i < tablica.length; i++)
            tablica[i] = i + 1;
*/


        IntStream.range( 0, 10 )
            .forEach(table -> System.out.println("INT: "+ table));

        // przy pomocy strumienia IntStream oraz metody
        // range(int startInclusive, int endExclusive)
        // wyświetlić kolejne elementy tablicy, a następnie:

    }
}
