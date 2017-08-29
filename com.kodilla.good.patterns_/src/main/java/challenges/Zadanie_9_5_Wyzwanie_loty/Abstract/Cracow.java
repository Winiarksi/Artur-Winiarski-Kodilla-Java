package challenges.Zadanie_9_5_Wyzwanie_loty.Abstract;

import challenges.Zadanie_9_5_Wyzwanie_loty.City;

import java.time.LocalDateTime;

public class Cracow extends City {

    public Cracow(String departureFrom, int yearD, int monthD, int dayOfMonthD, int hourD, int minuteD, int secondD,
                  String arrivalTo, int yearA, int monthA, int dayOfMonthA, int hourA, int minuteA, int secondA) {
        super(departureFrom, yearD, monthD, dayOfMonthD, hourD, minuteD, secondD,
                arrivalTo, yearA, monthA, dayOfMonthA, hourA, minuteA, secondA);
    }

    @Override
    public void process() {
    }
}
