package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// zbiór informacji, magazyn
public class Warehouse {
    Set<Shop> theShopList = new HashSet<>();

    public Warehouse(Set<Shop> theShopList) {
        this.theShopList = theShopList;
    }

    public void viewWarehouse(){
        for (Shop shop : theShopList) {
            System.out.println(shop);
        }
    }

    public Set<Shop> getShopList() {
        return theShopList;
    }
}