package challenges.Zadanie_9_2.ClassAll;

public class User {
    private String firstName;
    private String secoundName;
    private String city;


    public User(String firstName, String secoundName, String city) {
        this.firstName = firstName;
        this.secoundName = secoundName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecoundName() {
        return secoundName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secoundName='" + secoundName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
