package challenges.Module_9_2.ClassAll;

import challenges.Module_9_2.Interface.RentalRepository;

import java.time.LocalDateTime;

public class CarRenralRepository implements RentalRepository {
    public boolean createRental (User user, LocalDateTime from, LocalDateTime to){
        System.out.println("Poszło do bazy!");
        return true;
    }
}
