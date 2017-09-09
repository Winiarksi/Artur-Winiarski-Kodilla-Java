package com.kodilla.patterns.factory;

import com.kodilla.patterns.tasks.Task;
import com.kodilla.patterns.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test   // 1
    public void testFaktoryShoping() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shoping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoping.executeTask();
        System.out.println("################");

        // Then
        Assert.assertEquals("głód zakupowy",shoping.getTaskName() );
       // Assert.assertTrue(String.valueOf(true),shoping.isTaskExecuted() );
    }

    @Test   // 2
    public void testFaktoryPainting() {
        // Given
        TaskFactory factory2 = new TaskFactory();

        // When
        Task painting = factory2.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        System.out.println("################");

        // Then
        Assert.assertEquals("Kobieta uczona",painting.getTaskName() );
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test // 3
    public void testDrivingTask() {
        // Given
        TaskFactory factory3 = new TaskFactory();

        // When
        Task driving = factory3.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        System.out.println("################");

        // Then
        Assert.assertEquals("Prowadzenie wózka widłowego",driving.getTaskName() );
        Assert.assertFalse(driving.isTaskExecuted());
    }
}
