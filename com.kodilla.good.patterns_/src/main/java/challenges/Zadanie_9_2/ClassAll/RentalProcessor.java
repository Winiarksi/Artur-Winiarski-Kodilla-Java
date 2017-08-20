package challenges.Zadanie_9_2.ClassAll;

import challenges.Zadanie_9_2.Interface.InformationService;
import challenges.Zadanie_9_2.Interface.RentalRepository;
import challenges.Zadanie_9_2.Interface.RentalService;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(
                rentRequest.getUser(),
                rentRequest.getDatePutOnSale(),
                rentRequest.getDateOfSale(),
                rentRequest.getItem(),
                rentRequest.getPrice());

        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(
                    rentRequest.getUser(),
                    rentRequest.getDatePutOnSale(),
                    rentRequest.getDateOfSale(),
                    rentRequest.getItem(),
                    rentRequest.getPrice()
            );
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}