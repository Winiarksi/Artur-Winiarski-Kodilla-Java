package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

/**
 * Created by Artur Winiarski on 16.07.2017.
 */
public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.printf( "* Test klasy *\n" );
    }

    @After
    public void after() {
        System.out.printf( "* Koniec testu klasy *\n" );
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.printf("** Rozpoczęcie testu **\n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.printf("** Zakończenie testu **\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> theTestList = new ArrayList<Integer>();
        Random theGenerator = new Random();

        //When
        for ( int i = 0; i < 10; i++ ) {
            theTestList.add(theGenerator.nextInt(100));
        }
        //Then
        ArrayList<Integer> lista = oddNumbersExterminator.exterminate(theTestList);
        //lista.add(3);

        if ( lista.isEmpty() != false ) {
            System.out.println( "Pusta baza danych" );
        } else {
            System.out.println( "Baza danych nie jest pusta." );
        }

        boolean x = true;
        int temporaryValue = 0;
        for ( Integer i = 0; i < lista.size(); i++ ) {
            temporaryValue = lista.get(i);

            if ( temporaryValue % 2 != 0 ) {
                x = false;
                break;
            }
        }
        if ( x == true ) {
            System.out.println("Test klasy OddNumbersExterminator przeszedł pomyślnie.");
        } else {
            System.out.println("Test klasy OddNumbersExterminator wykazał błędy!");
        }
    }
}