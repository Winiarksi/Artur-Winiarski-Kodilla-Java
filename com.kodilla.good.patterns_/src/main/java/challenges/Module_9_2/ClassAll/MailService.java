package challenges.Module_9_2.ClassAll;

import challenges.Module_9_2.Interface.InformationService;

public class MailService implements InformationService {

    public void inform(User user){
        System.out.println( user.getName() + user.getSurname() + " yuo are renting a car." );
    }

}
