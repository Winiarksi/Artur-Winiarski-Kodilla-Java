package challenges.Zadanie_9_2;

import challenges.Zadanie_9_2.ClassAll.MailService;
import challenges.Zadanie_9_2.ClassAll.RentRequest;
import challenges.Zadanie_9_2.ClassAll.RentalProcessor;
import challenges.Zadanie_9_2.ClassAll.RentlRequestRetriever;
import challenges.Zadanie_9_2.ClassAll.ItemRentalService;
import challenges.Zadanie_9_2.ClassAll.ItemRenralRepository;

public class Main {
    public static void main(String[] args){

        RentlRequestRetriever rentlRequestRetriever = new RentlRequestRetriever();

        RentRequest rentRequest = rentlRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(),
                new ItemRentalService(),
                new ItemRenralRepository()
        );

        rentalProcessor.process(rentRequest);

    }
}
