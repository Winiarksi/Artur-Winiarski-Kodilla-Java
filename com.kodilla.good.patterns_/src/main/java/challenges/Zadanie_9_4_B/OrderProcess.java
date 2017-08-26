package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.Set;

public class OrderProcess {


    Warehouse warehouse;

    Set<Shop> theShopList = warehouse.getShopList();


   // warehouse.getShopList();
  //  List<Company> companyList = warehouse.getTheCompanyList();


    public OrderProcess(final Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    protected void closingTransaction() {
    for(Shop order : theShopList){
        System.out.println(order);
        }
    }
}


