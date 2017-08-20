package challenges.Zadanie_9_2.ClassAll;

import java.time.LocalDateTime;

public class RentRequest {
    public User user;
    public LocalDateTime datePutOnSale;
    public LocalDateTime dateOfSale;
    public String item;
    public double price;

    public RentRequest(User user, LocalDateTime datePutOnSale, LocalDateTime dateOfSale, String item, double price) {
        this.user = user;
        this.datePutOnSale = datePutOnSale;
        this.dateOfSale = dateOfSale;
        this.item = item;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDatePutOnSale() {
        return datePutOnSale;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

}