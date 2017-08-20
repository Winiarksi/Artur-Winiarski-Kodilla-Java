package challenges.Zadanie_9_2.ClassAll;

import challenges.Zadanie_9_2.Interface.RentalService;

import java.time.LocalDateTime;

public class ItemRentalService implements RentalService{
    public boolean rent(User user, LocalDateTime datePutOnSale, LocalDateTime dateOfSale, String item, double price){
        System.out.println("Urzytkownik: " + user.getFirstName() + " " + user.getSecoundName()
                + " wystawiając przediom do sprzedarzy dnia: " + datePutOnSale.toString()
                + " sprzedał w dniu: " + dateOfSale.toString() + " za kwotę: " + price + " zł.");
        return true;
    }
}
