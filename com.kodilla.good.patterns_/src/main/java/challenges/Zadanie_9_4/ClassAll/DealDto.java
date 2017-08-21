package challenges.Zadanie_9_4.ClassAll;

import java.util.ArrayList;
import java.util.List;

public class DealDto {
    List<Company> companyList = new ArrayList<>();
    boolean isDeal;

    public DealDto(List<Company> companyList, boolean isDeal) {
        this.companyList = companyList;
        this.isDeal = isDeal;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public boolean isDeal() {
        return isDeal;
    }
}
