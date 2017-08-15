package com.kodilla.exception.test_8_4z;

import java.util.*;

public class SearchFlight {
    Flight flight;
    List<Flight> listAirport = new ArrayList<>();
public SearchFlight(){

    listAirport.add (new Flight ("Wroclaw", "Berlin"));
    listAirport.add (new Flight ("Krakow", "London"));
    listAirport.add (new Flight ("Wroclaw", "Moscow"));
    listAirport.add (new Flight ("Barcelona", "Berlin"));
    listAirport.add (new Flight ("London", "Wroclaw"));
    listAirport.add (new Flight ("Moscow", "Berlin"));
}


    public void findFilght(Flight flight) throws  RouteNotFoundException{

         for( Flight połączenie : listAirport ){
            if ( !listAirport.contains(flight)) {
                throw new RouteNotFoundException("\nOne of the given airports does not exist!");
            }
        }
   }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}
