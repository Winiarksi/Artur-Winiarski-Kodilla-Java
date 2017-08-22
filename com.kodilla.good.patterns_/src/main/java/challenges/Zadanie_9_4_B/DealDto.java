package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;
import java.util.Set;

public class DealDto {
    Set<Shop> companyList = new HashSet<>();
    boolean isDeal;

    public DealDto(Set<Shop> companyList, boolean isDeal) {
        this.companyList = companyList;
        this.isDeal = isDeal;
    }

    public Set<Shop> getShopList() {
        return companyList;
    }

    public boolean isDeal() {
        return isDeal;
    }
}
