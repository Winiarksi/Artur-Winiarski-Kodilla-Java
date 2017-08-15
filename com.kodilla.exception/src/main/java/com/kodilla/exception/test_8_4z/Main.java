package com.kodilla.exception.test_8_4z;

import static java.lang.System.out;

public class Main {
    public static void main(String args[]) throws RouteNotFoundException {


        SearchFlight searchFlight = new SearchFlight();

        try {
            searchFlight.findFilght(new Flight("Wrocław", "Berlin"));
        } catch (RouteNotFoundException e) {
            e.printStackTrace(out);
        } finally {
            out.println("The end.");
        }

    }
}