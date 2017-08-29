package challenges.Zadanie_9_5_B;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightInformation {
    private Set<Connection> theListCityConnection = new HashSet<>();
    private Set<Connection> collect1 = new HashSet<>();
    private Set<Connection> collect2 = new HashSet<>();

    public void initialiseListCityConnection(){
        theListCityConnection.add( new Connection("Wroclaw", "Berlin" ));
        theListCityConnection.add( new Connection("Wroclaw", "Gdansk" ));
        theListCityConnection.add( new Connection("Berlin", "Paryż" ));
        theListCityConnection.add( new Connection("Gdansk", "Berlin" ));
    }

    public Set<Connection> searchConnetionFromCity(String cityFrom){

        collect1 = theListCityConnection.stream()
                .filter(n -> n.getCityFrom().equals(cityFrom))
                .collect(Collectors.toSet());

        return collect1;
    }

    public Set<Connection> searchConnetionToCity(String cityTo){

        collect2 = theListCityConnection.stream()
                .filter(n -> n.getCityTo().equals(cityTo))
                .collect(Collectors.toSet());

        return this.collect2;
    }

    public void showDirectConnection(){

        for (Connection e : collect1
                ) {
            System.out.println(e.getCityFrom() + " " + e.getCityTo());

        }

        for (Connection f : collect2
                ) {
            System.out.println(f.getCityFrom() + " " + f.getCityTo());
        }

    }


    public void showConnectionWithChangeovers(){
        for ( Connection e: collect1
             ) {

            for (Connection f: collect2
                 ) {
                    if(f.getCityFrom().equals(e.getCityTo())){
                    System.out.println(e.getCityFrom() + " " + e.getCityTo());
                    System.out.println(f.getCityFrom() + " " + f.getCityTo());
                }
            }
        }
    }

}
