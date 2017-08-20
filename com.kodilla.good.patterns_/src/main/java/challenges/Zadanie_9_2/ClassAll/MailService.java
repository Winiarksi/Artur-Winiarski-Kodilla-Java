package challenges.Zadanie_9_2.ClassAll;

import challenges.Zadanie_9_2.Interface.InformationService;

public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println( user.getFirstName() + user.getSecoundName() + " yuo are sell iteam." );
    }
}
