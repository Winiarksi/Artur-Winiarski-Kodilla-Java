package challenges.Zadanie_9_4.ClassAll;

import challenges.Zadanie_9_4.Interface.SendDealRepository;
import challenges.Zadanie_9_4.Interface.SendDealService;
import challenges.Zadanie_9_4.Interface.InformationService;

import java.util.List;

public class OrderProcess {

    private InformationService informationService;
    private SendDealService sendDealService;
    private SendDealRepository sendDealRepository;

    public OrderProcess(InformationService informationService,
                        SendDealService sendDealService,
                        SendDealRepository sendDealRepository) {
        this.informationService = informationService;
        this.sendDealService = sendDealService;
        this.sendDealRepository = sendDealRepository;
    }

    public DealDto process( final Warehouse warehouse) {
        List<Company> companyList = warehouse.getTheCompanyList();
        boolean isDeal = companyList.isEmpty();

        if (isDeal) {
            System.out.println("Brak towaru.");
            return new DealDto(companyList, false);
        } else {
            informationService.inForm();
            sendDealService.deal();
            sendDealRepository.dealRepository();
            return new DealDto(companyList, true);
        }
    }

}


