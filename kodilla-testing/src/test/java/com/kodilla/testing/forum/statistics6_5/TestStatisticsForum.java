package com.kodilla.testing.forum.statistics6_5;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticsForum {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Rozpoczęcie wszystkich testów.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("\nI to już jest koniec, i nie ma już żadnych...  testów.");
        System.out.println("Dziękuję za uwagę.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nTest nr # " + testCounter + ", GO!");
    }
    @After
    public void afterSingleTest() {
        System.out.println("\nTest nr # " + testCounter + " zakończony pomyślnie.");
    }



    @Test // Nr 1
    public void testCalculateAdvStatisticsWithMock() {

    // Given
        Statistics statisticsMock = mock( Statistics.class ); // tworzony jest mock interfejsu
        List<String> userName = new ArrayList<String>(); //  przygotowujemy obiekt, zwraca metoda .usersNames()
        for ( int i = 0; i < 102; i++ ) {
            userName.add( "Użytkownik_" + (i+1) );
        }

        when( statisticsMock.usersNames()).thenReturn(userName);    // wywołujemy metode userNames() z zawartoscią Listy

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsForum statisticsForum = new StatisticsForum(statisticsMock);

    // When
        statisticsForum.calculateAdvStatistics();
        statisticsForum.showStatistics();

    // Then
        Assert.assertEquals(102, statisticsForum.numberOfUsers);

    }

    @Test // Nr 2
    public void testCalculateAdvStatisticsWithMockWithZero() {

        // Given
        Statistics statisticsMock = mock( Statistics.class ); // tworzony jest mock interfejsu
        List<String> userName = new ArrayList<String>(); //  przygotowujemy obiekt, zwraca metoda .usersNames()
        for ( int i = 0; i < 100; i++ ) {
            userName.add( "Użytkownik_" + (i+1) );
        }

        when( statisticsMock.usersNames()).thenReturn(userName);    // wywołujemy metode userNames() z zawartoscią Listy

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsForum statisticsForum = new StatisticsForum(statisticsMock);

        // When
        statisticsForum.calculateAdvStatistics();
        statisticsForum.showStatistics();

        // Then
        Assert.assertFalse(  statisticsForum.isItZero(statisticsForum.numberOfUsers));
        Assert.assertFalse(  statisticsForum.isItZero(statisticsForum.postsCount));
        Assert.assertTrue(  statisticsForum.isItZero(statisticsForum.numberOfComments));
        Assert.assertTrue(  statisticsForum.isItZero(statisticsForum.averageCommentsPost));

    }
    @Test // Nr 3
    public void testCalculateAdvStatisticsWithMockBigOrSmall() {

        // Given
        Statistics statisticsMock = mock( Statistics.class ); // tworzony jest mock interfejsu
        List<String> userName = new ArrayList<String>(); //  przygotowujemy obiekt, zwraca metoda .usersNames()
        for ( int i = 0; i < 50; i++ ) {
            userName.add( "Użytkownik_" + (i+1) );
        }

        when( statisticsMock.usersNames()).thenReturn(userName);    // wywołujemy metode userNames() z zawartoscią Listy

        when(statisticsMock.postsCount()).thenReturn(666);
        when(statisticsMock.commentsCount()).thenReturn(999);

        StatisticsForum statisticsForum = new StatisticsForum(statisticsMock);

        // When
        statisticsForum.calculateAdvStatistics();
        statisticsForum.showStatistics();

        // Then
        Assert.assertTrue(  statisticsForum.BigOrSmall(statisticsForum.numberOfComments, statisticsForum.postsCount));
        Assert.assertFalse(  statisticsForum.BigOrSmall(statisticsForum.postsCount, statisticsForum.numberOfComments));
    }
}
