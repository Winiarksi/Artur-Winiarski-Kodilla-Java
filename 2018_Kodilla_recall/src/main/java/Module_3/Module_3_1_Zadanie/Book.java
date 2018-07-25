package Module_3.Module_3_1_Zadanie;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private LocalDate localDate;

    public Book(String title, String author, int yearOfPublication,
                int monthOfPublication, int dayOfPublication){
        this.title = title;
        this.author = author;
        this.localDate = LocalDate.of(yearOfPublication, monthOfPublication, dayOfPublication);
    }

    public int hashCode(){
        return localDate.getYear() * 100 + localDate.getMonthValue();
    }

    public boolean equals(Object o) {
        Book book = (Book) o;
        return (title.equals(book.getTitle())&&
                (author.equals(book.getAuthor()))&&
                (localDate.getYear() == book.getLocalDate().getYear())&&
                (localDate.getMonth() == book.getLocalDate().getMonth()) &&
                (localDate.getDayOfMonth() == book.getLocalDate().getDayOfMonth()));
        }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String toString(){
        return title + ", " + author + ", " + localDate;
    }
}
