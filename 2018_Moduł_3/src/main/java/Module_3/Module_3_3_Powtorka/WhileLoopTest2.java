package Module_3.Module_3_3_Powtorka;

import java.util.Random;

public class WhileLoopTest2 {

    public static void main ( String[] args ){

        int counter = 0;
        boolean loggerIn = false;

        Random randomGenerator = new Random();

        while(!loggerIn){

            counter++;
            System.out.println("Próba nr: " + counter);
            int random =  randomGenerator.nextInt(100);
            System.out.println("Random: " + random);
            if( random > 90){
                System.out.println("Random: " + random);
                loggerIn = true;
            }
        }
    }
}
