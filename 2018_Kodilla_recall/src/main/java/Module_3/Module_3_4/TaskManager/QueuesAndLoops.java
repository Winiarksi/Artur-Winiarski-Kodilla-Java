package Module_3.Module_3_4.TaskManager;

import java.util.ArrayDeque;

public class QueuesAndLoops {

    public static void main(String[] args) {


        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();

        for (int i = 0; i < 5; i++) {
            taskQueue1.offer("The first task number " + (i+1));
        }


        ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();

        for (int i = 0; i < 5; i++) {
            taskQueue2.offer("The second task number " + (i+1));
        }

        TaskManager taksExecutor = new TaskManager();
        taksExecutor.executeTasks(taskQueue1);
        taksExecutor.executeTasks(taskQueue2);


    }
}


