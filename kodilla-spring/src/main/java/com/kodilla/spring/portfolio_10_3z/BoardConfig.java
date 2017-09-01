package com.kodilla.spring.portfolio_10_3z;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("1")
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean
    public Board getBean()   {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "1")
    @Scope("prototype")
    public TaskList getToDoList() {
        return toDoList;
    }
    @Bean(name = "2")
    @Scope("prototype")

    public TaskList getInProgressList() {
        return inProgressList;
    }
    @Bean(name = "3")
    @Scope("prototype")

    public TaskList getDoneList() {
        return doneList;
    }
}

/*
Napisz klasę konfigurującą Beany o nazwie BoardConfig,
która utworzy trzy różne Beany reprezentujące listy zadań
i wstrzyknie je do Beana klasy Board.
 */