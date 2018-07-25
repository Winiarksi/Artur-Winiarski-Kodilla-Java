package Module_3.Module_3_2_Zadanie;

import java.time.LocalDate;

public class Order2 {
    private Book3 book3;
    private LocalDate localDate;

    public Order2(Book3 book3, int year, int month, int day){
        this.book3 = book3;
        this.localDate = LocalDate.of(year, month, day);
    }

    public Book3 getBook3() {
        return book3;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String toString(){
        return book3 + ", " + localDate;
    }
}
