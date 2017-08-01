package com.kodilla.testing.forum.statistics6_5;

import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // Całkowita ilość postów na forum
    int commentsCount();       // Całkowita ilość komentarzy na forum ilość
}