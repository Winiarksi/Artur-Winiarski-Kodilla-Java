package Module_3.Module_3_5_Zadanie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        long begin, end;
        LinkedList<Book> listBook = new LinkedList<Book>();

        for ( int i = 0; i < 10000000; i++){
            listBook.add(new Book("Koziołek Matołek", "Stefan Burczymucha", i));
        }

        begin = System.nanoTime();
        listBook.remove(0);
        end = System.nanoTime();

        System.out.println("Time dla poz 0: " + (end - begin) + " ms,");

        begin = System.nanoTime();
        listBook.remove(listBook.size()-1);
        end = System.nanoTime();

        System.out.println("Time dla poz 1: " + (end - begin) + " ms,");

        for (int i = 0; i < 10; i++) {
            System.out.println(listBook.get(i));
        }

        // HashMap

        HashMap<Integer, Book> listHashMap = new HashMap<Integer, Book>();
        for ( Integer i = 0; i < 10000000; i++){
            listHashMap.put(i, new Book("Miś Kolargo", "Pan Kleks", (i - 10000000)));
        }


        begin = System.nanoTime();
        listHashMap.remove(0);
        end = System.nanoTime();

        System.out.println("Time HashMap dla poz 0: " + (end - begin) + " ms,");

        begin = System.nanoTime();
        listHashMap.remove(listHashMap.size()-1);
        end = System.nanoTime();

        System.out.println("Time HashMap dla poz ostatniej: " + (end - begin) + " ms,");

        for (Map.Entry<Integer, Book> entry : listHashMap.entrySet()){
            System.out.println(entry.getValue());
            if (entry.getKey() == 10) break;
        }


    }

}
