package Module_3.Module_3_3_Zadanie;

import java.util.Random;

public class WyscigiSum {

    int sumaA;
    int sumaB;

    public WyscigiSum(){
        this.sumaA = 1000;
        this.sumaB = 0;
    }

    Random randomInt = new Random();
    public void calculator(){
        int count = 0;
        while(sumaA > sumaB){
            count++;
            sumaA += randomInt.nextInt(9);
            sumaB += randomInt.nextInt(49);
        }

        System.out.println("B > A: " + sumaB + ">" + sumaA);
        System.out.println("Pętla while wykonała się: " + count + " razy.");
    }

    public static void main(String[] args){
        WyscigiSum wyscigiSum = new WyscigiSum();
        wyscigiSum.calculator();
    }

}
