package Module_3.Module_3_5;

import java.util.ArrayList;

public class ArrayListSpeedTest {

    public static void main(String[] args){

        //Creating collection with 4000000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 4000000; i++){
            list.add(i);
        }

        //Displaying quantity of elements
        System.out.println("Quantity of elements in the collection: " + list.size());

        // Adding element at the end of the collection
        long begin = System.currentTimeMillis();
        list.add(list.size());
        long end = System.currentTimeMillis();

        //Display tyme of the operation
        System.out.println("Adding element at the od of the collection has taken: " +
                ( end - begin ) + " ms.");

        // Adding element at the beginning of the collection
        begin = System.currentTimeMillis();
        list.add(0, list.size());
        end = System.currentTimeMillis();

        // Displaying time of the collenction
        System.out.println("Adding element at the beginning of the collection ha taken: " +
                ( end - begin ) + " ms.");
    }

}
