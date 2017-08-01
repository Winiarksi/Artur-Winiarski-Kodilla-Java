package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    // Napisz testy sprawdzające metody klasy ShapeCollector

    private static int testCounter = 0;

    @BeforeClass // DLACZEGO MA  ZNACZENIE KOLEJNOSC TESTÓW ?
    public static void beforeAllTests() {
        System.out.println("Rozpoczynamy główne testowanie.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("Wszystkie testy zakończone.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("# " + testCounter + " test rozpoczęty");
    }

    @Test // DODAWNIE
    public void testAddFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure(new Circle("Koło pierwsze", 5.5));

        // Then
        Assert.assertTrue(theShape.getFigure(0) instanceof Circle);
    }

    @Test // USUWANIE
    public void testRemoveFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();
        Triangle triangle = new Triangle("Trójkąt", 6.71, 6.0, 3);
        theShape.addFigure(triangle); // jak to inaczej zapisać ?

        //When
        theShape.removeFigure(triangle);

        // Then
        Assert.assertFalse(theShape.getFigure(0) instanceof Triangle);
    }

    @Test // POBIERANIE
    public void testGetFigure() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure( new Square("Kwadrat", 5.5 ));

       // Then
        Assert.assertTrue(theShape.getFigure(0)instanceof Square);
    }


    @Test // WYSWIETLENIE
    public void testshowFigures() {
        // Given
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure( new Square("Kwadrat", 5.5 ));
        theShape.addFigure( new Triangle("Trójkąt", 6.71, 6.0, 3));
        theShape.addFigure( new Circle("Koło pierwsze", 5.5));

        // Then
        Assert.assertTrue(  theShape.showFigures() );
    }



}
