package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.ExtraFoodShop;
import challenges.Zadanie_9_4_B.Abstract.GlutenFreeShop;
import challenges.Zadanie_9_4_B.Abstract.HealthyShop;
import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShopResourceInformation {

    Set<Shop> theShopList = new HashSet<>();

    public Set<Shop> theCompanyList() {
        theShopList.add(new HealthyShop("HealthyShop", "Ser Biały", 120, 10.12));
        theShopList.add(new GlutenFreeShop("GlutenFreeShop", "Fistaszki", 20 ,85.23));
        theShopList.add(new ExtraFoodShop("ExtraFoodShop", "Marchewka ECO", 505, 1.86));

        return theShopList;
    }

    }
