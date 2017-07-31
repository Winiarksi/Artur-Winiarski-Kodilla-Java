package com.kodilla.testing.forum.statistics;

import java.util.List;
import java.util.ArrayList;

public class StatisticsForum{
    int numberOfUsers;              // Ilość użytkowników
    int postsCount;                 // Ilość postów
    int numberOfComments;           // Ilosć komentarzy
    double averagePostsUser;        // Średnia ilość postów na użytkownika
    double averageCommentsUser;     // Średnia ilość komentarzy na użytkownika
    double averageCommentsPost;     // Średnia ilość komentarzy na post
    Statistics statistics;          // DLACZEGO TAKI ZAPIS ?

    public StatisticsForum(Statistics statistics){

        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){ // do wyjaśnienia ta klasa
    // obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy
        numberOfUsers = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsUser = statistics.postsCount()/statistics.usersNames().size();
        averageCommentsUser = statistics.commentsCount()/statistics.usersNames().size();
        averageCommentsPost = statistics.commentsCount()/statistics.postsCount();
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
