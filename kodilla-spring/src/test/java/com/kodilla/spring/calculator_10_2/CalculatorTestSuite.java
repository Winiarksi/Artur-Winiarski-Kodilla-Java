package com.kodilla.spring.calculator_10_2;

import com.kodilla.spring.calculator_10_2z.Calculator;
import com.kodilla.spring.calculator_10_2z.Display;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
    //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When

        calculator.add(5, 51);
        calculator.sub(5, 51);
        calculator.mul(5, 51);
        calculator.div(5, 51);

        // Then
        //do nothing
    }
}
