package challenges.Zadanie_9_2.ClassAll;

public class RentalDto {
    public User user;
    public boolean isSolt;

    public RentalDto ( final User user, final boolean isSolt) {
        this.user = user;
        this.isSolt = isSolt;
    }

    public User getUser() {
        return user;
    }

    public boolean isSolt() {
        return isSolt;
    }
}
