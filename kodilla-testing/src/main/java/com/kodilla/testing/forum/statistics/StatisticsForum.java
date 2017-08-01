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

        numberOfUsers = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsUser = postsCount/numberOfUsers ;           //statistics.postsCount()/statistics.usersNames().size();
        averageCommentsUser = numberOfComments/numberOfUsers;   //statistics.commentsCount()/statistics.usersNames().size();
        averageCommentsPost = numberOfComments/postsCount;      // statistics.commentsCount()/statistics.postsCount();
    }

    public void showStatistics(){

        System.out.println("numberOfUsers: " + numberOfUsers);
        System.out.println("postsCount: " + postsCount);
        System.out.println("numberOfComments: " + numberOfComments);
        System.out.println( "averagePostsUser: " + averagePostsUser );
        System.out.println( "averageCommentsUser: " + averageCommentsUser );
        System.out.println( "averageCommentsPost: " + averageCommentsPost );
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
