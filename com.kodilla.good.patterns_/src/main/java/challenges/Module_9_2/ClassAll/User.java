package challenges.Module_9_2.ClassAll;

public class User {
public String name;
public String surName;

    public User( String name, String seName ) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    @Override
    public String toString() {
        return "User: " +
                "firstName='" + name + '\'' +
                ", seName='" + surName + '\'' +
                '.';
    }
}
