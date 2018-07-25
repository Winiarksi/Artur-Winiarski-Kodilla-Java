package Module_3.Module_3_2;

import java.time.LocalDate;

public class Order {
    Book2 book;
    LocalDate dateOfOrder;

    public Order(Book2 book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public String toString(){
        return book + ", " + dateOfOrder +" \" test \" ";
    }

    public Book2 getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
