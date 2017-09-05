package com.kodilla.patterns.tasks.implement;

import com.kodilla.patterns.tasks.Task;

import java.util.Random;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Piękna pani jest na " + taskName + " i coś musi zakupić, bo bedzie źle!");
        System.out.println("Zdecydowała, że zakupi sobie " + whatToBuy + " w ilości " + quantity + " par.");
    }

    @Override
    public String getTaskName() {

        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        Random random = new Random();
        return random.nextBoolean();
    }
}