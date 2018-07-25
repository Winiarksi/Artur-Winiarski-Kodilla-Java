package Module_6.Module_6_1_Zadanie;

public class CalculatorTasks {

    private CalculatorZad calculatorZad;

    public CalculatorTasks(CalculatorZad calculatorZad){
        this.calculatorZad = calculatorZad;
    }

    public int add(){
        return calculatorZad.getA() + calculatorZad.getB();
    }

    public int substract(){
        return calculatorZad.getA() - calculatorZad.getB();
    }

}
