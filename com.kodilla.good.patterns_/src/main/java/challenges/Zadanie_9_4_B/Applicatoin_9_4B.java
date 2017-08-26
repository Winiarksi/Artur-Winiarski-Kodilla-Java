package challenges.Zadanie_9_4_B;




public class Applicatoin_9_4B {
    public static void main(String[] args){


/*        healthyShop.process();
        healthyShop.getCompanyName();
*/
        ResourceInformation resourceInformation = new ResourceInformation();
        Warehouse warehouse = resourceInformation.getShopList();
        warehouse.viewWarehouse();
        //OrderProcess orderProcess = new OrderProcess(warehouse);

          //  orderProcess.closingTransaction();

    }
}
