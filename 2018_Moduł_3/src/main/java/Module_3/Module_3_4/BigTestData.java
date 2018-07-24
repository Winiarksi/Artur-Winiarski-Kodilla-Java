package Module_3.Module_3_4;

import java.util.ArrayList;
import java.util.Random;

public class BigTestData {

    public static void main(String[] args){

        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();

        for(int i = 0; i < 2000000; i++){
            theBigList.add(theGenerator.nextInt(50000));
        }

        System.out.println(theBigList.size());

    }

}
