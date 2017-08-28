package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;

// zbiór informacji, magazyn
public class Warehouse {

    private HashSet<Shop> theShopList = new HashSet<>();

    public Warehouse(HashSet<Shop> theShopList) {
        this.theShopList = theShopList;
    }

    public HashSet<Shop> getShopList() {
        return new HashSet<Shop>(theShopList); // czemu nie mogę tego pociągnąć ? pisze, że Set to abstrakcja
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "theShopList=" + theShopList +
                '}';
    }
}