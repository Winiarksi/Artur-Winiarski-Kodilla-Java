package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.HealthyShop;
import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;
import java.util.Set;

public class ResourceInformation {
    Set<Shop> theShopList = new HashSet<>();

    public Warehouse getShopList() {
        theShopList.add(new HealthyShop("HealthyShop", "Pomidor", 120, 15.45));
        theShopList.add(new HealthyShop("HealthyShop", "Pomidor", 120, 15.45));
        theShopList.add(new HealthyShop("HealthyShop", "Pomidor", 120, 15.45));

        for (Shop s: theShopList) {
            System.out.println(s);
        }
        return new Warehouse(theShopList);
    }
}
