package com.kodilla.spring.portfolio_10_3z;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


    @Bean
    public Board getBean()   {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean
    public TaskList getToDoList() {


        return new TaskList("getToDoList");
    }

    @Bean
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList getDoneList() {

        return new TaskList();
    }
}

/*
Napisz klasę konfigurującą Beany o nazwie BoardConfig,
która utworzy trzy różne Beany reprezentujące listy zadań
i wstrzyknie je do Beana klasy Board.
 */