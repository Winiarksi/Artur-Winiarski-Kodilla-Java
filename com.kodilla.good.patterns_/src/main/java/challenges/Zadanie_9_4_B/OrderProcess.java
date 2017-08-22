package challenges.Zadanie_9_4_B;

import challenges.Zadanie_9_4_B.Abstract.Shop;

import org.junit.Assert;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderProcess {

      private InformationService informationService;

    public OrderProcess(InformationService informationService) {
        this.informationService = informationService;
    }
    public DealDto process( final Warehouse warehouse) {
        Set<Shop> shopsList = warehouse.getTheShopList();
        // boolean isDeal = companyList.isEmpty();
       // boolean isDeal = companyList.contains(new HealthyShop("HealthyShop", "Ser Biały", 120, 10.12));

        boolean isDeal = false;
/*
        shopsList.stream()
                .map(shop -> shop.getCompanyName() == "HealthyShop")
                .collect(Collectors.toSet());
        Assert.assertTrue(shopsList.contains("HealthyShop"));
*/
         if (isDeal) {
            System.out.println("Brak towaru.");
            return new DealDto(shopsList, false);
        } else {
            informationService.inForm();
            return new DealDto(shopsList, true);
        }
    }

}


