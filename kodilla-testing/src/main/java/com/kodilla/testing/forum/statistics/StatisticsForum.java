package com.kodilla.testing.forum.statistics;

import java.util.List;
import java.util.ArrayList;

public class StatisticsForum implements Statistics{
    int numberOfUsers;              // Ilość użytkowników
    int postsCount;                 // Ilość postów
    int numberOfComments;           // Ilosć komentarzy
    double AveragePostsUser;        // Średnia ilość postów na użytkownika
    double AverageCommentsUser;     // Średnia ilość komentarzy na użytkownika
    double AverageCommentsPost;     // Średnia ilość komentarzy na post
    Statistics statistics;          // DLACZEGO TAKI ZAPIS ?

    public StatisticsForum(Statistics statistics){

        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
    // obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy

    }

    public void ShowStatistics(){
    // która wyświetli zapamiętane we właściwościach statystyki.

    }
}

/*
obliczającą następujące statystyki:

*   Ilość użytkowników
*   Ilość postów
*   Ilość komentarzy
*   Średnia ilość postów na użytkownika
*   Średnia ilość komentarzy na użytkownika
*   Średnia ilość komentarzy na post

* calculateAdvStatistics(Statistics statistics) która obliczy podane powyżej wartości
        i zapamięta je we właściwościach (polach) klasy

* ShowStatistics(), która wyświetli zapamiętane we właściwościach statystyki.

*/
