/**
 * Created by Artur Winiarski on 16.07.2017.
 */
package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    ArrayList<Integer> exterminateOdd;

    public OddNumbersExterminator(){
        exterminateOdd = new ArrayList<Integer>();
    }
    // metoda
    public ArrayList<Integer> exterminate( ArrayList<Integer> theList ){

        int temporaryValue = 0;

        for ( int i = 0; i < theList.size(); i++ ){
            temporaryValue = theList.get( i );
            if( temporaryValue %2 == 0 ){
               System.out.println( "A_" + temporaryValue + " size " + theList.size() );
                exterminateOdd.add( temporaryValue );
            }
        }
     //   return exterminateOdd;
    }


    public ArrayList getEven(){
        return exterminateOdd;
    }

    public void getPrint(ArrayList<Integer> theList) {
        int temporaryValue = 0;
        for (int i = 0; i < theList.size(); i++) {
            temporaryValue = theList.get(i);
            System.out.println( "B_" + temporaryValue);
        }
    }
}

/*
metodę exterminate(ArrayList<Integer> numbers)
przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
która zwraca również kolekcję ArrayList liczb typu Integer,
stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
 */