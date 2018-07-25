package Module_3.Module_3_4.LinkenListDuplikaty;

public class MyObject {

    int value;

    public MyObject(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o){
        MyObject myObj = ( MyObject ) o;

        if(myObj.getValue() == value){
            return true;
        } else{
            return false;
        }
    }

    public int getValue() {
        return value;
    }
}
