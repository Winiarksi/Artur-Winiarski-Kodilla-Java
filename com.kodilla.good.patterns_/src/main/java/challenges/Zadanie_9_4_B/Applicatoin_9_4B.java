package challenges.Zadanie_9_4_B;

public class Applicatoin_9_4B {
    public static void main(String[] args){

        ResourceInformation resourceInformation = new ResourceInformation();
        Warehouse warehouse = resourceInformation.getShopList();
        OrderProcess orderProcess = new OrderProcess(warehouse);
        orderProcess.getShopList();
        orderProcess.separationOfClassesFromTheCollection();
    }
}
