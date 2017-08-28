package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.ExtraFoodShop;
import challenges.Zadanie_9_4_B.Abstract.GlutenFreeShop;
import challenges.Zadanie_9_4_B.Abstract.HealthyShop;
import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;

public class ResourceInformation {
    HashSet<Shop> theShopList = new HashSet<>();

    public Warehouse getShopList() {
        theShopList.add(new HealthyShop("HealthyShop", "Marchewka", 105, 3.45));
        theShopList.add(new GlutenFreeShop("GlutenFreeShop", "Pomidor", 120, 15.21));
        theShopList.add(new ExtraFoodShop("ExtraFoodShop", "Pomidor", 200, 9.00));

        return new Warehouse(theShopList);
    }
}
