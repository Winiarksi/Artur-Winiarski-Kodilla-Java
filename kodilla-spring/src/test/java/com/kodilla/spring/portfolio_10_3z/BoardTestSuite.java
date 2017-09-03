package com.kodilla.spring.portfolio_10_3z;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getToDoList().getTasks().add("Task one");
        board.getInProgressList().getTasks().add("Task two");
        board.getDoneList().getTasks().add("Task three");

        // Then
        String taskName1=board.getToDoList().getTasks().get(0);
        String taskName2=board.getInProgressList().getTasks().get(0);
        String taskName3=board.getDoneList().getTasks().get(0);

        Assert.assertEquals("Task one", taskName1);
        Assert.assertEquals("Task two", taskName2);
        Assert.assertEquals("Task three", taskName3);
    }
}
