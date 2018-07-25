package Module_3.Module_3_4.LinkenListDuplikaty;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class UniqueTest {

    public static void main(String[] args) {

        LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();

        Random theGenerator = new Random();
        for (int i = 0; i < 100; i++) {
            listOfNumbers.add(new MyObject(theGenerator.nextInt()));
        }

        Iterator<MyObject> iterator = listOfNumbers.iterator();

        int count = 0;

        while (iterator.hasNext()) {
            MyObject examinedObject = iterator.next();
            System.out.println(count + ". examinedObject.getValue(): " + examinedObject.getValue());
            System.out.println(count + ". listOfNumbers: " + listOfNumbers.get(count).getValue());


            //preventing to compare the obcject with himself
            for (int k = 0; k < listOfNumbers.size(); k++) {
                System.out.println(listOfNumbers.get(k).hashCode() != examinedObject.hashCode());

                if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {
                    System.out.println(listOfNumbers.get(k).equals(examinedObject));

                    // if duplicated...
                    if (listOfNumbers.get(k).equals(examinedObject)) {
                        System.out.println("Duplicated: " + examinedObject.getValue());
                    }
                }
            }
        }




    }
}
