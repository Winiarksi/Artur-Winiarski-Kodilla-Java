package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

/**
 * Created by Artur Winiarski on 11.07.2017.
 */
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser ( "theForumUser123" );

        String result = simpleUser.getUsername();

        if ( result.equals( "theForumUser1234" ) ) {
            System.out.println("Forum User Ok!");
        } else {
            System.out.println("Forum User Nie ok!");
        }

        System.out.println("\nTest - Artura pierwszy test jednostkowy:");

        int a = 10;
        int b = 20;
        Calculator calculator = new Calculator( a, b );

        calculator.add();
        calculator.subtract();

        int resultAdd = calculator.getResultAdd();
        int resultSubtract = calculator.getResultSubtract();

        if ( resultAdd == a + b ) // nie wiem czy szłusznie, ale ominąłem "equals"
            System.out.println("Dodawanie OK.");
        else {
            System.out.println("Dodawanie Nie Ok!!!");
        }

        if ( resultSubtract == a - b )
            System.out.println("Odejmowanie OK.");
        else {
            System.out.println("Odejmowanie Nie Ok!!!");
        }
    }
}