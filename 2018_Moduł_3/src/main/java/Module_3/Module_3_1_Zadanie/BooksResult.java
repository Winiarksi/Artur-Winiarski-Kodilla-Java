package Module_3.Module_3_1_Zadanie;

import java.util.HashSet;

public class BooksResult {

    public static void main( String[] args ) {

        HashSet<Book> books = new HashSet();
        books.add(new Book("Koziołek Matołek","kowlaski", 1981, 10, 11));
        books.add(new  Book("The Story", "Harrison", 1897, 2, 3));
        books.add(new  Book("The Story2", "Harrison2", 2011, 1, 14));
        books.add(new  Book("The Story3", "Harrison3", 2014, 3, 10));

        for ( Book book : books){
            if(book.getLocalDate().getYear() >= 2010) {
                System.out.println(book);
            }
        }

    }
}
