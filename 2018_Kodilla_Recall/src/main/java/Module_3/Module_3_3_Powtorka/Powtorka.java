package Module_3.Module_3_3_Powtorka;

import java.util.HashSet;
import java.util.Iterator;

public class Powtorka {

    // ITERATOR
    // HASHSET
    public static void main( String[] args ){

    Newspaper news1 = new Newspaper("Wyborcza", 2.45,2018, 7, 18);
    Newspaper news2 = new Newspaper("Fakt", 2.02,2018, 7, 18);
    Newspaper news3 = new Newspaper("Polityka", 1.65,2018, 7, 18);
    Newspaper news4 = new Newspaper("Robocza", 3,2018,7,  18);


        HashSet<Newspaper> theListEmployee = new HashSet<Newspaper>();
        theListEmployee.add(news1);
        theListEmployee.add(news2);
        theListEmployee.add(news3);
        theListEmployee.add(news4);

        Iterator<Newspaper> theList = theListEmployee.iterator();

        while(theList.hasNext()){
            Newspaper newspaperX = theList.next();
            System.out.println(newspaperX);
        }

    }

}
