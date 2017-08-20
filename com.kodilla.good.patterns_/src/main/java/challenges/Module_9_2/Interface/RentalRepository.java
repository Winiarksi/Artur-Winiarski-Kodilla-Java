package challenges.Module_9_2.Interface;

import challenges.Module_9_2.ClassAll.User;

import java.time.LocalDateTime;

public interface RentalRepository {
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
