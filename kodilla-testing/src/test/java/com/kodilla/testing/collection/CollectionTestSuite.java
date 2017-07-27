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
        System.out.printf("*** Rozpoczęcie testu ***\n");
    }

    @After
    public void after() {
        System.out.printf("*** Zakończenie testu ***\n");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.printf("** Test klasy **\n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.printf("** Koniec testu klasy **\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> theTestList = new ArrayList<Integer>();
        Random theGenerator = new Random();

        //When
        for (int i = 0; i < 10; i++) {
            theTestList.add(theGenerator.nextInt(100));
        }
        //Then
        oddNumbersExterminator.exterminate(theTestList);

        oddNumbersExterminator.getPrint(theTestList);

        if (theTestList.isEmpty() != false) {
            System.out.println("Pusta baza");
        } else {
            System.out.println("Baza z danymi");
        }

        int temporaryValue = 0;
        for (Integer i = 0; i < theTestList.size(); i++) {
         //   temporaryValue = oddNumbersExterminator.getEven(i);
            if (temporaryValue % 2 != 0) {
                System.out.println("Test negatywny " + temporaryValue);
                break;
            } else {
                System.out.println("Wynik testu pozytywny " + temporaryValue);
            }
        }
    }
}

 // testOddNumbersExterminatorEmptyList
    // (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)

//  testOddNumbersExterminatorNormalList
    // (sprawdzi czy klasa zachowuje się poprawnie gdy lista zawiera
        //liczby parzyste i nieparzyste)




/*
napisz testy sprawdzające czy metoda filtrująca liczby nieparzyste działa poprawnie:

 Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym,
  jakie operacje (testy) są aktualnie wykonywane.


 */