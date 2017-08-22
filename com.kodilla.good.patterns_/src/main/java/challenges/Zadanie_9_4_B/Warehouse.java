package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;
import java.util.HashSet;
import java.util.Set;

// zbiór informacji, magazyn
public class Warehouse {
    Set<Shop> theShopList = new HashSet<>();

    public Warehouse(Set<Shop> theCompanyList) {
        this.theShopList = theCompanyList;
    }

    public Set<Shop> getTheShopList() {
        return theShopList;
    }
}
