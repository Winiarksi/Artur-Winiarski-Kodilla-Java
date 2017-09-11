package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Testing list";
    private static final String DESCRIPTION = "Test, testem pogania";

    @Test
    public void testFindByListName(){
        //  Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //  When
        taskListDao.save(taskList);

        //  Then
        int id = taskList.getId();
        TaskList readTaskiList = taskListDao.findOne(id); // chyba zajeżdza tu hipokryzją
        Assert.assertEquals(id, .getId());
        //  CleanUp

    }

    //  sprawdzający czy metoda findByListName(String listName) działa poprawnie


}