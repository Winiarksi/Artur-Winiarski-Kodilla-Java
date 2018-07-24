package Module_6.Module_6_1_Zadanie;

public class CalculatorZad {

    private int a;
    private int b;

    public CalculatorZad(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "CalculatorZad: " +
                "a=" + a +
                ", b=" + b;
    }
}
