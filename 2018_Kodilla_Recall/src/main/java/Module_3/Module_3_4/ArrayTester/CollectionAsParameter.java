package Module_3.Module_3_4.ArrayTester;

import java.util.ArrayList;
import java.util.Random;

public class CollectionAsParameter {

    public static void main( String[] args ){

        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();

        for(int i =0; i < 200; i++){
            theBigList.add(theGenerator.nextInt(100));
            }

        ArrayTester arrayTester = new ArrayTester();
        arrayTester.printEven(theBigList);
        }
}