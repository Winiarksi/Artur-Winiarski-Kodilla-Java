package Module_3.Module_3_3;

import java.util.Random;

public class WhileLoopTest {

    public static void main(String[] args ){

        boolean loggedIn = false;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        while(!loggedIn){
            tryCounter++;
            System.out.println("\nWaiting for the User to sign in: [attempt # " + tryCounter + "]");
            int random2 = randomGenerator.nextInt(100);
            System.out.println(random2);
            if( random2 > 90 ){
                System.out.println(random2);
                loggedIn = true;
            }
        }
        System.out.println("User logged in!");
    }
}
