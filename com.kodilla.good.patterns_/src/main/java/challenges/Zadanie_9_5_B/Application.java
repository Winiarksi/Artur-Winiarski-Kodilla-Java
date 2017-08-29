package challenges.Zadanie_9_5_B;

public class Application {
    public static void main(String[] args) {
        FlightInformation flightInformation = new FlightInformation();
        flightInformation.initialiseListCityConnection();

        flightInformation.searchConnetionFromCity("Wroclaw");
        flightInformation.searchConnetionToCity("Berlin");
//        flightInformation.showDirectConnection();
        flightInformation.showConnectionWithChangeovers("Wroclaw", "Berlin");

    }
}
