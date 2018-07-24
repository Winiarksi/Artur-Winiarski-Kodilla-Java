package Module_6.Module_6_3_Zadanie;

import java.util.ArrayList;
import java.util.Random;

public class Tool {
    private int sizeList;
    private int sizeRandom;

    public Tool(int sizeList, int sizeRandom){
        this.sizeList = sizeList;
        this.sizeRandom = sizeRandom;
    }

    public ArrayList makeLoop(){
        ArrayList<Integer> iterableList = new ArrayList<Integer>();
        Random random= new Random();

        for( int i = 0; i < getSizeList(); i++){
            iterableList.add(random.nextInt(getSizeRandom()));
        }
        return iterableList;
    }

    public boolean checkEven( ArrayList<Integer> listEvenToCheck ){
        for(Integer check : listEvenToCheck){
            if( check % 2 != 0 ) return false;
        }
        return true;
    }


    public int getSizeList() {
        return sizeList;
    }

    public int getSizeRandom() {
        return sizeRandom;
    }

}
