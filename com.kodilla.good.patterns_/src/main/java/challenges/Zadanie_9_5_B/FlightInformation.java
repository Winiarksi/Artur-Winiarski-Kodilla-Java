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
        theListCityConnection.add( new Connection("Paryż", "Berlin" ));
        theListCityConnection.add( new Connection("Wroclaw", "Warszawa" ));
        theListCityConnection.add( new Connection("Warszawa", "Berlin" ));
        theListCityConnection.add( new Connection("Wroclaw", "Poznan" ));
    }

    public Set<Connection> searchConnetionFromCity(String cityFrom){

        Set<Connection> collect1 = theListCityConnection.stream()
                .filter(n -> n.getCityFrom().equals(cityFrom))
                .collect(Collectors.toSet());

        return collect1;
    }

    public Set<Connection> searchConnetionToCity(String cityTo){

        Set<Connection> collect2 = theListCityConnection.stream()
                .filter(n -> n.getCityTo().equals(cityTo))
                .collect(Collectors.toSet());

        return collect2;
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


    public void showConnectionWithChangeovers(String cityFrom, String cityTo ) {

        Set<Connection> collect3 = theListCityConnection.stream()
                .filter(n -> n.getCityFrom().equals(cityFrom))
                .collect(Collectors.toSet());

        Set<Connection> collect4 = theListCityConnection.stream()
                .filter(n -> n.getCityTo().equals(cityTo))
                .collect(Collectors.toSet());


        for (Connection e : collect3
                ) {

            for (Connection f : collect4
                    ) {

                if (e.getCityFrom().equals(cityFrom) || e.getCityFrom().equals(cityTo)) {

                    if (e.getCityTo().equals(f.getCityFrom())) {
                        System.out.println(e.getCityFrom() + " " + e.getCityTo());
                        System.out.println(f.getCityFrom() + " " + f.getCityTo());
                        System.out.println("###################################");
                    }
                }
            }
        }

    }}
