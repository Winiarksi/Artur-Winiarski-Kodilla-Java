/**
 * Created by Artur Winiarski on 16.07.2017.
 */
package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
   // metoda
    public ArrayList<Integer> exterminate( ArrayList<Integer> theList ){

        ArrayList<Integer> theResultList = new ArrayList<>();

        for (Integer element : theList){
            if( element %2 == 0 ){
                theResultList.add(element);
            }
        }
        return theResultList;
    }
}
