package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;

public class OrderProcess {

    Warehouse warehouse;
    HashSet<Shop> theShopList = new HashSet<>();

    public OrderProcess(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public HashSet<Shop> getShopList(){
        this.theShopList = warehouse.getShopList();

        return theShopList;
    }

    public void SeparationOfClassesFromTheCollection(){

        for (Shop shops: theShopList) {
            shops.process();
        }
    }
}



