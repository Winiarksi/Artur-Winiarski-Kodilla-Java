package Module_3.Module_3_2;

public class Book2 {

    private String title;
    private String author;
    int year;

    public Book2 (String title, String author, int year ){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return title + ", " + author + ", " + year;
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
}
