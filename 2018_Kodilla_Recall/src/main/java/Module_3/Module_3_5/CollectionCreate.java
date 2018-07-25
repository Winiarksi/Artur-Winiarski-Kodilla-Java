package Module_3.Module_3_5;

import java.util.ArrayList;

public class CollectionCreate {

    public static void main (String[] args){
        // Creating collection with 8000000 elements of Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for( int i = 0; i < 8000000; i++){
            list.add(i);
        }
        // Display quantity (ilość) of elements in the collection
        System.out.println("Quantuty of elements in the collections: " + list.size());


        // Deleting  last element from the collection
        long begin = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();

        // Display last elemtnr for collection
        System.out.println("Removing last element has taken: " + (end - begin) + " ms");

        //Deleting first element from collection
        begin = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();

        // Display time of delete operation
        System.out.println("Removing first element has taken: " + (end - begin) + " ms");
    }

}
