package challenges.Module_9_2;

import challenges.Module_9_2.ClassAll.*;

public class Application {

    public static void main ( String[] args) {

    RentlRequestRetriever rentlRequestRetriever = new RentlRequestRetriever();
    RentRequest rentRequest = rentlRequestRetriever.retrieve();

    RentalProcessor rentalProcessor = new RentalProcessor(
            new MailService(), new CarRentalService(),
            new CarRenralRepository());
    rentalProcessor.process(rentRequest);
}

}
