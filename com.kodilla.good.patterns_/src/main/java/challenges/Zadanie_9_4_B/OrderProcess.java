package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.HashSet;

public class OrderProcess {

    private Warehouse warehouse;
    private HashSet<Shop> theShopList = new HashSet<>();

    public OrderProcess(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void getShopList(){
        this.theShopList = warehouse.getShopList();
    }

    public void separationOfClassesFromTheCollection(){

        for (Shop shops: theShopList) {
            shops.process();
        }
    }
}



