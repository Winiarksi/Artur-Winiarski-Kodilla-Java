package com.kodilla.stream;

import com.kodilla.stream.beautifier_7_1.PoemBeautifier;
import com.kodilla.stream.iterate_7_2.NumbersGenerator;
import com.kodilla.stream.lambda_7_1.ExpressionExecutor;
import com.kodilla.stream.reference_7_1.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("*** ", (text) -> text.substring(1).replace("*", "###@@@###@@@###@@@###")));
        System.out.println(poemBeautifier.beautify("Kwiatki, bratki i stokrotki", (text) -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("  Ale  że o chodzi z tym dekorowaniem?", (text) -> text.trim().toLowerCase().replace("?", "?!?")));
        System.out.println(poemBeautifier.beautify(" *** XXX  ***", (text) -> text.trim()));
        System.out.println("");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}