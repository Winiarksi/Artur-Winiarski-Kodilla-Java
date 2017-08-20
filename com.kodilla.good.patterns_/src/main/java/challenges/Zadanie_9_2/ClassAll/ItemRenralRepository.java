package challenges.Zadanie_9_2.ClassAll;

import challenges.Zadanie_9_2.Interface.RentalRepository;

import java.time.LocalDateTime;

public class ItemRenralRepository implements RentalRepository{
    public boolean createRental(
            User user,
            LocalDateTime datePutOnSale,
            LocalDateTime dateOfSale,
            String item,
            double price) {
        System.out.println("Poszło do bazy!");
        return true;
    }
}