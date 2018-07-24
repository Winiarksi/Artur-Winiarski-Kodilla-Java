package Module_3.Module_3_4.TaskManager;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {

    ArrayList<String> executedTasks;

    public TaskManager(){
        executedTasks = new ArrayList<String>();
    }

    public void executeTasks(ArrayDeque<String> theQueue){

        while(theQueue.size() > 0){
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);

            executedTasks.add(theTask);
        }

        System.out.println("\nExeduted total " + executedTasks.size() + " tasks\n");

    }

}
