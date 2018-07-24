package Module_3.Module_3_2;

import java.util.ArrayDeque;

public class OrdersQueueExample {
    public static void main(String[] agrs){
        Book2 book1 = new Book2("Gra o Tron", "Martin", 2001);
        Book2 book2 = new Book2("Oko Saurona", "Mickiewicz", 2001);
        Book2 book3 = new Book2("Gra w klasy", "Marian", 2001);

        Order theOrder1 = new Order(book1, 2010, 1, 3);
        Order theOrder2 = new Order(book2, 1999, 4, 14);
        Order theOrder3 = new Order(book1, 1980, 1, 13);
        Order theOrder4 = new Order(book2, 2002, 11, 13);
        Order theOrder5 = new Order(book3, 2003, 12, 25);

        // FIFO
        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();
        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);

        // check size
        System.out.println("Wielkość FIFO: " + theOrders.size());

        // Examine the order at beginning of the queue
        System.out.println("Pobranie czegoś  z FIFO.peek(): " + theOrders.peek());

        // Get objects  from queue
        Order temporaryOrder;
        temporaryOrder = theOrders.poll();
        System.out.println("Pobranie po usunięciu poll z FIFO.peek(): " + theOrders.peek());
        System.out.println("Wielkość FIFO: " + theOrders.size());
        System.out.println("Pobrany obiekt z kolejki FIFO.pool(): " + temporaryOrder.toString());

        // Usuwamy resztę dokumentnie
        theOrders.poll();
        theOrders.poll();
        theOrders.poll();
        theOrders.poll();
        System.out.println("Pusta FIFO? : " + theOrders.size());

    }
}
