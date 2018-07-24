package Module_3.Module_3_4.ArrayTester;

import java.util.ArrayList;

public class ArrayTester {

    public void printEven(ArrayList<Integer>theList){

        int temporaryValue = 0;

        for(int i = 0; i < theList.size(); i++){
            temporaryValue = theList.get(i);

            if(temporaryValue % 2 == 0){
                System.out.println(temporaryValue);
            }
        }

    }

}
