package com.kodilla.patterns.tasks;

import com.kodilla.patterns.tasks.implement.DrivingTask;
import com.kodilla.patterns.tasks.implement.PaintingTask;
import com.kodilla.patterns.tasks.implement.ShoppingTask;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Prowadzenie wózka widłowego", "hali targowej", "Jungheinrich HC 110");
            case PAINTINGTASK:
                return new PaintingTask("Kobieta uczona", "błękinty", "pół akt");
            case SHOPPINGTASK:
                return new ShoppingTask("głód zakupowy", "eleganckie buciki", 5);
            default:
                return null;
        }
    }
}
