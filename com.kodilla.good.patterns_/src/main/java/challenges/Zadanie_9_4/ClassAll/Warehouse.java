package challenges.Zadanie_9_4.ClassAll;

import java.util.ArrayList;
import java.util.List;

// zbiór informacji, magazyn
public class Warehouse {
    List<Company> theCompanyList = new ArrayList<>();

    public Warehouse(List<Company> theCompanyList) {
        this.theCompanyList = theCompanyList;
    }

    public List<Company> getTheCompanyList() {
        return theCompanyList;
    }
}
