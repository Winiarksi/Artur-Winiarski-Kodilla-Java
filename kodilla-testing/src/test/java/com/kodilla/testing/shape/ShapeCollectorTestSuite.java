package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    // Napisz testy sprawdzające metody klasy ShapeCollector

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Rozpoczynamy główne testowanie.");
    }
    @AfterClass
    public static void afterAllTest() {
        System.out.println("Wszystkie testy zakończone.")
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println( "# " + testCounter + " test rozpoczęty");
    }
    @Test // DODAWNIE
    public void testAddFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure( new Circle( "Koło pierwsze", 5.5 ));

        // Then
        Assert.assertEquals( 1, theShape.getFigure(0));
    }

    @Test // USUWANIE
    public void testRemoveFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When


        // Then

    }

    @Test // POBIERANIE
    public void testGetFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When

        // Then

    }

    @Test // WYSWIETLENIE
    public void testshowFigures() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When


        // Then
        // Assert.assertEquals( 1, theShape.getFigure(0));
    }



}
