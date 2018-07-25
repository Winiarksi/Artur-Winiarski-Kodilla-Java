package Module_3.Module_3_2_Zadanie;

public class Book3 {

    private String title;
    private String author;
    private int year;

    public Book3(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return title + ", " + author + ", " + year;
    }

}
