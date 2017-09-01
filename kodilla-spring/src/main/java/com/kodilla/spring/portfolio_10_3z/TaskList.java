package com.kodilla.spring.portfolio_10_3z;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}
