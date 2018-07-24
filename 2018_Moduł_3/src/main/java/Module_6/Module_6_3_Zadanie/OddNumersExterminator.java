package Module_6.Module_6_3_Zadanie;

import java.util.ArrayList;
import java.util.Random;

public class OddNumersExterminator {

    private ArrayList<Integer> listEven;

    public OddNumersExterminator(){
        listEven = new ArrayList<Integer>();
    }

    public ArrayList<Integer> extermiante(ArrayList<Integer> numbers) {

        for (Integer i : numbers) {
            if (i % 2 == 0) listEven.add(i);
        }

        return listEven;
    }

    public ArrayList<Integer> getListEven() {
        return listEven;
    }
}
