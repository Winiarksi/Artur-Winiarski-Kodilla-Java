package Module_3.Module_3_2_Zadanie;

import java.util.ArrayDeque;

public class OrdersQueueBooks {

    public static void main(String[] args){

        Order2 order1 = new Order2(new Book3("Pierwsza pozycja ", "Rolnik", 2001), 2010, 10, 12);
        Order2 order2 = new Order2(new Book3("Druga Pozycja", "Zielarz", 1854), 2011, 8, 1);
        Order2 order3 = new Order2(new Book3("Trzecia Pozycja", "Rolnik", 1999), 2010, 1, 5);
        Order2 order4 = new Order2(new Book3("Czwarta Pozycja", "Rolnik", 2002), 2012, 8, 12);
        Order2 order5 = new Order2(new Book3("Piąta Pozycja", "Rolnik", 2014), 2015, 5, 9);


        ArrayDeque<Order2> theOrdersFifo = new ArrayDeque<Order2>();
        theOrdersFifo.offer(order1);
        theOrdersFifo.offer(order2);
        theOrdersFifo.offer(order3);
        theOrdersFifo.offer(order4);
        theOrdersFifo.offer(order5);

        System.out.println("1. Size FIFO: " + theOrdersFifo.size());
        System.out.println("1. Odczyt pierwszej kolejki: " + theOrdersFifo.peek());

        System.out.println("\nZabieram pierwszą cegiełkę");
        Order2 orderX;
        orderX = theOrdersFifo.poll();

        System.out.println("2. Size FIFO: " + theOrdersFifo.size());
        System.out.println("2. Odczyt pierwszej kolejki: " + theOrdersFifo.peek());
        System.out.println("2. Odczyt popbranego obiektu: " + orderX.toString());

        while(theOrdersFifo.size() > 0 ){
            theOrdersFifo.poll();
            System.out.println("Size: " + theOrdersFifo.size());
        }

        System.out.println("The End");
    }
}
