package challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainStore {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        System.out.println("Opcja nr 1.");

        movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue() + " ! ")
                .forEach(System.out::print);

        System.out.println("\nOpcja nr 2.");

        String tleTitles = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue() + "")
                .collect(Collectors.joining(", ","",""));

        System.out.println(tleTitles);
    }
}
