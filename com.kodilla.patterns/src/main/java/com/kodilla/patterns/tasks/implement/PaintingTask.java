package com.kodilla.patterns.tasks.implement;

import com.kodilla.patterns.tasks.Task;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("W penej kimatycznej artysycznej pracownii pracowała malarka, Daria.");
        System.out.println("Malowała " + whatToPaint + " w tonacji koloru " + color);
        System.out.println("Obraz ten zwł się będzie: " + taskName + ".");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}