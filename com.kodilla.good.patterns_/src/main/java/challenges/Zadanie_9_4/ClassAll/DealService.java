package challenges.Zadanie_9_4.ClassAll;

import challenges.Zadanie_9_4.Interface.SendDealService;

public class DealService implements SendDealService{
    public boolean deal(){
        System.out.println("Poszło do serwisu.");

        return true;
    }
}
