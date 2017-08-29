package challenges.Zadanie_9_5_Wyzwanie_loty;

import java.time.LocalDateTime;

public abstract class City {
    protected String departureFrom;
    protected String arrivalTo;
    LocalDateTime departure; // odlot
    LocalDateTime arrival; // przylot


    /*
    of(int year, int month, int dayOfMonth, int hour, int minute, int second)
     */


    public City(String departureFrom, int yearD, int monthD, int dayOfMonthD, int hourD, int minuteD, int secondD,
                String arrivalTo,int yearA, int monthA, int dayOfMonthA, int hourA, int minuteA, int secondA
    ) {
        this.departureFrom = departureFrom;
        this.departure.of(yearD, monthD, dayOfMonthD, hourD, minuteD, secondD);
        this.arrivalTo = arrivalTo;
        this.departure.of(yearA, monthA, dayOfMonthA, hourA, minuteA, secondA);
    }

    public abstract void process();

}
