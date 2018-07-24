package Module_3.Module_3_3_Powtorka;

import Module_3.Module_3_2_Zadanie.Book3;

import java.time.LocalDate;

public class Order3 {
    private Book3 book3;
    private LocalDate localDate;

    public Order3(Book3 book3, int year, int month, int day ){
        this.book3 = book3;
        this.localDate = localDate.of(year, month, day);
    }

    public Book3 getBook3() {
        return book3;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String toString(){
        return book3 + ", " + localDate + " \"tego stulecia\"";
    }

}
