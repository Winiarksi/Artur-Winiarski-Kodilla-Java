package challenges.Zadanie_9_4.ClassAll;

import java.util.ArrayList;
import java.util.List;

public class ComapnyResourceInformation {

    List<Company> theCompanyList = new ArrayList<>();

    public Warehouse theCompanyList() {
        theCompanyList.add(new Company(null, "Marchewka", 120));
        theCompanyList.add(new Company("EcoFood", "Kapusta czerwona", 222));
        theCompanyList.add(new Company("GreenFood", "Ananas", 505));

        return new Warehouse(theCompanyList);

    }
}


