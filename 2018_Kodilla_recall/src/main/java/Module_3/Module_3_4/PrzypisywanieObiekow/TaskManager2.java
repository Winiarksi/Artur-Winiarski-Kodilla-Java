package Module_3.Module_3_4.PrzypisywanieObiekow;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager2 {

    ArrayList<String> executedTasks;

    public TaskManager2() {
        executedTasks = new ArrayList<String>();
    }


    // method saving the list of tasks
    public void executeTasks(ArrayDeque<String> theQueue) {
        while (theQueue.size() > 0) {

            String theTask = theQueue.poll();
            System.out.println("Procesing the task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nExecuted  total " + executedTasks.size() + " tasks\n");
    }
}