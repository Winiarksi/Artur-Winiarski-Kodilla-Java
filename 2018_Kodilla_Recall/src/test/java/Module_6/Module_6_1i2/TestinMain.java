package Module_6.Module_6_1i2;

import Module_6.Module_6_1.Calkulator;
import Module_6.Module_6_1.SimpleUser;
import Module_6.Module_6_1_Zadanie.CalculatorZad;
import Module_6.Module_6_1_Zadanie.CalculatorTasks;

public class TestinMain {

    public static void main( String[] args ){

        System.out.println("Moduł 6. Wprowadzenie do testowania.");

        SimpleUser simpleUser = new SimpleUser("theFormumUser");
        String result = simpleUser.getUserName();

        if( result.equals("theFormumUser")){
            System.out.println("Test Ok!");
        } else {
            System.out.println("Error");
        }

        // Module_6_2
        // Test CalculatorZad-a

        // Given
        CalculatorTasks calculatorTasks = new CalculatorTasks(new CalculatorZad(5, 2));
        // When
        int add = calculatorTasks.add();
        int subtract = calculatorTasks.substract();

        //Then
        if(add == (int)7 && subtract == (int)3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Module_6_3
        //Testing Calculator class
        Calkulator calkulator = new Calkulator();

        int addResult = calkulator.add(180,19);
        int subResult = calkulator.subtrack(200,150);

        System.out.println("\nModule_6_3, //Testing Calculator class");
        if( addResult == 199 && subResult == 50){
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator test ERROR");
        }
    }
}
