package challenges.Zadanie_9_4;

import challenges.Zadanie_9_4.ClassAll.*;
import challenges.Zadanie_9_4.Interface.SendDealRepository;

public class Application {
    public static void main(String[] args){

        ComapnyResourceInformation comapnyResourceInformation = new ComapnyResourceInformation();

        Warehouse warehouse = comapnyResourceInformation.theCompanyList();

   /*     OrderProcess orderProcess = new OrderProcess();
        orderProcess.process(warehouse);
*/
        OrderProcess orderProcess = new OrderProcess(
                new MailService(),
                new DealService(),
                new DealRepository()
        );

        orderProcess.process(warehouse);

    }
}

