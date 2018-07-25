package Module_3.Module_3_3_Powtorka;

import Module_3.Module_3_2_Zadanie.Book3;

import java.util.ArrayDeque;

public class Fifo {


    public static void main(String[] args){

        Order3 order1 = new Order3(new Book3("A", "B", 2013), 2014, 10, 30);
        Order3 order2 = new Order3(new Book3("C", "D", 2014), 2014, 11, 23);
        Order3 order3 = new Order3(new Book3("E", "F", 2015), 2015, 5, 21);
        Order3 order4 = new Order3(new Book3("H", "I", 2016), 2016, 4, 1);


        // KOLEKCJA LIFO
        ArrayDeque<Order3> theListBooksLifo = new ArrayDeque<Order3>();
        theListBooksLifo.push(order1);
        theListBooksLifo.push(order2);
        theListBooksLifo.push(order3);
        theListBooksLifo.push(order4);

        System.out.println("Size FIFO: " + theListBooksLifo.size());
        System.out.println("PObód danych *.pop(): " + theListBooksLifo.pop());
        System.out.println("Size FIFO: " + theListBooksLifo.size());

        order4 = theListBooksLifo.peek();

        System.out.println("Pobrana kolejka *.peek(): " + order4.toString());
        System.out.println("Size FIFO: " + theListBooksLifo.size());

        //  KOLEJKA FIFO
/*      ArrayDeque<Order3> theListBooks = new ArrayDeque<Order3>();
        theListBooks.offer(order1);
        theListBooks.offer(order2);
        theListBooks.offer(order3);
        theListBooks.offer(order4);


        System.out.println("1.Size list: " + theListBooks.size());
        System.out.println("1.Pool z list: " + theListBooks.poll());  // pobieramy i zabieramy
        System.out.println("2.Size list: " + theListBooks.size());
        System.out.println("2.Peek list: " + theListBooks.peek()); // tylko odczytujemy
        System.out.println("3.Size list: " + theListBooks.size());
*/




    }
}
