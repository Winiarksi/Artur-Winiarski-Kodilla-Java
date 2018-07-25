package Module_3_4_Zadanie;

import java.util.ArrayDeque;
import java.util.Random;

public class LiteryWezykiem {

    public static void main ( String[] args) {

        // Kolekcja Quote
        ArrayDeque<String> listA = new ArrayDeque<String>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            String b = "";
            for (int j = 0; j < random.nextInt(51); j++) {
                b += "a";
            }
            listA.offer(b);
        }

        System.out.println("Rozmiar  listy: " + listA.size());

        Separate separate = new Separate(listA);
        separate.separate();

        System.out.println("A size: " + separate.getListAN().size());
        System.out.println("B size: " + separate.getListAP().size());
    }
}
