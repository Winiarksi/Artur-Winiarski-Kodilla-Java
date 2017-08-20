package challenges.Zadanie_9_2.ClassAll;

import java.time.LocalDateTime;

public class RentlRequestRetriever {

    public RentRequest retrieve() {
        User user = new User ( "John", "Snow", "Castle Black");

        LocalDateTime datePutOnSale = LocalDateTime.of(2009, 5, 1, 11, 06);
        LocalDateTime dateOfSale = LocalDateTime.of(2010, 12, 6, 10, 12);
        String item = "Smocze szkło";
        double price = 20000;

        return new RentRequest(user, datePutOnSale, dateOfSale, item, price);
    }

}
