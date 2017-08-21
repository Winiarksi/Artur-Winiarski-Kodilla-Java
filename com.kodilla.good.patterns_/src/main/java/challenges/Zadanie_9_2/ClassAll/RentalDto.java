package challenges.Zadanie_9_2.ClassAll;

public class RentalDto {
    public User user;
    public boolean isSold;

    public RentalDto ( final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}