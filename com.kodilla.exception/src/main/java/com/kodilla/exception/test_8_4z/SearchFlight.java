package com.kodilla.exception.test_8_4z;

import java.util.*;

public class SearchFlight {
    Flight flight;
    List<Flight> listAirport = new ArrayList<>();
public SearchFlight(){

    listAirport.add(new Flight("Wrocław", "Berlin") );
    listAirport.add(new Flight("Kraków", "Londyn") );
    listAirport.add(new Flight("Wrocław", "Moskwa") );
    listAirport.add(new Flight("Barcelona", "Wrocław") );
    listAirport.add(new Flight("Londyn", "Wrocław") );
    listAirport.add(new Flight("Moskwa", "Berlin") );
}


    public void findFilght(Flight flight){

       System.out.println(listAirport.contains(flight));

        for( Flight połączenie : listAirport ){
          //  listAirport.contains(flight);
            listAirport.size();
            System.out.println(połączenie.getArrivalAirport());
            System.out.println(listAirport.equals(flight));

        }


   }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}
