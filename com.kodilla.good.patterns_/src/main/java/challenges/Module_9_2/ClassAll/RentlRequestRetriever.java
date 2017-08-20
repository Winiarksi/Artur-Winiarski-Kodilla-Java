package challenges.Module_9_2.ClassAll;

import java.time.LocalDateTime;

public class RentlRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("John", "Welk");

        LocalDateTime rentFrom = LocalDateTime.of(2007, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 10);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
