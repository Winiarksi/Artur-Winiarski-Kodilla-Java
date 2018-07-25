package Module_3.Module_3_3_Powtorka;

import java.time.LocalDate;

public class Newspaper {

    private String title;
    private double prize;
    private LocalDate localDate;

    public Newspaper(String title, double prize,  int year, int month,  int day){
        this.title = title;
        this.prize = prize;
        this.localDate = LocalDate.of(year, month, day);
    }

    public int hashCode(){
        return localDate.getYear() * 100 + localDate.getMonthValue();

    }

    public boolean equals(Object o){
        Newspaper news = (Newspaper) o;
        return (title.equals(news.getTitle()))&&
                (prize == news.getPrize())&&
                (localDate.getYear() == news.getLocalDate().getYear())&&
                (localDate.getMonth() == news.getLocalDate().getMonth())&&
                (localDate.getDayOfMonth() == news.getLocalDate().getDayOfMonth());
    }

    public String getTitle() {
        return title;
    }

    public double getPrize() {
        return prize;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", prize=" + prize +
                ", localDate=" + localDate;
    }
}
