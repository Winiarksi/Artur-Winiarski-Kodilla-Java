package challenges.Zadanie_9_4.ClassAll;

import challenges.Zadanie_9_4.Interface.SendDealRepository;

public class DealRepository implements SendDealRepository{
    public boolean dealRepository(){
        System.out.println("Poszło do bazy.");
        return true;
    }
}
