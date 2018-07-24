package Module_3_4_Zadanie;

import java.util.ArrayDeque;

public class Separate {

    private ArrayDeque<String> listA;
    private ArrayDeque<String> listAP;
    private ArrayDeque<String> listAN;

    public Separate(ArrayDeque<String> listA) {
        this.listA = listA;
        listAP = new ArrayDeque<String>();
        listAN = new ArrayDeque<String>();
    }

    public void separate(){
//        listAP = new ArrayDeque<String>();
//        listAN = new ArrayDeque<String>();
        for ( String list : listA) {
            String getList = listA.poll();
            if(list.length() % 2 == 0 ){
                System.out.println("Parzysta: " + list.length() % 2 + ", " + list);
                listAP.offer(getList);
            } else {
                System.out.println("NieParzysta: " + list.length() % 2 + ", " + list);
                listAN.offer(getList);
            }
        }
    }

    public ArrayDeque<String> getListA() {
        return listA;
    }

    public ArrayDeque<String> getListAP() {
        return listAP;
    }

    public ArrayDeque<String> getListAN() {
        return listAN;
    }
}
