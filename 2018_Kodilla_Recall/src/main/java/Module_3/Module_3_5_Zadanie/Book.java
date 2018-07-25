package Module_3.Module_3_5_Zadanie;

import java.util.Random;

public class Book {

    private String author;
    private String title;
    private int numer;

    public Book(String author, String title, int numer){
        this.author = author;
        this.title = title;
        this.numer = numer;
    }

    public int hashCode(){
        Random n = new Random(100);
        return n.nextInt();
    }

    public boolean equals(Object o){
        Book b = (Book) o;
        return (author.equals(b.getAuthor()))&&
                (title.equals(b.getTitle()))&&
                (numer == b.getNumer());
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumer() {
        return numer;
    }

    public String toString(){
        return author + ", " + title  + ", " + numer;
    }

}
