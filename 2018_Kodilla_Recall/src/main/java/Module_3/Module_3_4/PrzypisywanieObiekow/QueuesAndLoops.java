package Module_3.Module_3_4.PrzypisywanieObiekow;

import java.util.ArrayDeque;

public class QueuesAndLoops {

    public static void main(String[] ards) {

        //the first task's list
        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
        for (int i = 0; i < 5; i++) {
            taskQueue1.offer("The first task number " + (i + 1));
        }

        // the second task's list
        ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();
        for ( int i = 0; i < 5; i++){
            taskQueue2.offer("The second task: " + (i +1));
        }

        TaskManager2 taskExecutor = new TaskManager2();
        taskExecutor.executeTasks(taskQueue1);
        taskExecutor.executeTasks(taskQueue2);

    }
}
