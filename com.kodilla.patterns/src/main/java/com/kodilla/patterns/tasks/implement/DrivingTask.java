package com.kodilla.patterns.tasks.implement;

import com.kodilla.patterns.tasks.Task;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("W" + where + "  wykonywane jest pewne zadanie.");
        System.out.println(taskName + " jest w trakcie wykonywania.");
        System.out.println("Do tego celu używa " + using + ".");
        System.out.println("Czy się uda czy nie, to się okaże");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}