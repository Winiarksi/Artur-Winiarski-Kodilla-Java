package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticsForum {

    @Test
    public void testCalculateAdvStatisticsWithMock() {

    // Given
        Statistics statisticsMock = mock( Statistics.class ); // tworzony jest mock interfejsu
        List<String> userName = new ArrayList<String>(); //  przygotowujemy obiekt, zwraca metoda .usersNames()
        for ( int i = 0; i < 101; i++ ) {
            userName.add( "Użytkownik_" + (i+1) );
        }

        when( statisticsMock.usersNames()).thenReturn(userName);    // wywołujemy metode userNames() z zawartoscią Listy

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsForum statisticsForum = new StatisticsForum(statisticsMock);


    // When
        statisticsForum.calculateAdvStatistics(statisticsMock);
        statisticsForum.showStatistics();

    // Then
        //Assert.assert... ( );
    }
}
/*
Testy zrealizuj przy pomocy mocka interfejsu Statistics.
 Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

gdy liczba postów = 0
gdy liczba postów = 1000
gdy liczba komentarzy = 0
gdy liczba komentarzy < liczba postów
gdy liczba komentarzy > liczba postów
gdy liczba użytkowników = 0
gdy liczba użytkowników = 100
*/