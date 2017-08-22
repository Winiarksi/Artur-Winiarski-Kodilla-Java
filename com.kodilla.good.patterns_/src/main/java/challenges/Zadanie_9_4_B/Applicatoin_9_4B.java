package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import java.util.Set;

public class Applicatoin_9_4B {
    public static void main(String[] args){

        ShopResourceInformation shopResourceInformation = new ShopResourceInformation();

        Warehouse warehouse = shopResourceInformation.theCompanyList();

   /*     OrderProcess orderProcess = new OrderProcess();
        orderProcess.process(warehouse);
*/
        OrderProcess orderProcess = new OrderProcess(
                new MailService()
        );

        orderProcess.process(warehouse);

    }
}
