package Module_3.Module_3_1;

import java.time.LocalDate;

public class Employee {
    String firstName;
    String lastName;
    LocalDate brithDate;

    public Employee(String firstName, String lastName, int yearOfBirth,
                    int monthOfBrith, int dayOfBrith){
        this.firstName = firstName;
        this.lastName = lastName;
        this.brithDate = LocalDate.of(yearOfBirth, monthOfBrith, dayOfBrith);
    }

    public int hashCode(){
        return brithDate.getYear() * 100 + brithDate.getMonthValue();
    }

    public boolean equals(Object o ) {
        Employee e = (Employee) o;
        return (firstName.equals(e.getFirstName()))&&
                (lastName.equals(e.getLastName()))&&
                (brithDate.getYear() == e.getBrithDate().getYear())&&
                (brithDate.getMonth() == e.getBrithDate().getMonth())&&
                (brithDate.getDayOfMonth() == e.getBrithDate().getDayOfMonth());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", brithDate=" + brithDate;
    }
}
