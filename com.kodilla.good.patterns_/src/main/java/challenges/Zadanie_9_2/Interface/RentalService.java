package challenges.Zadanie_9_2.Interface;

import challenges.Zadanie_9_2.ClassAll.User;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime datePutOnSale, LocalDateTime dateOfSale, String item, double price);
}
