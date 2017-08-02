package com.kodilla.stream.lambda;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text. ");
    /*    System.out.println("ExecuteSaySomething przeszedł przez kl Processor  !! ");
        System.out.println("Przekazaliśmy również kod, który ma być wykonany ");
        System.out.println("(w postaci implementacji metody execute() obiektu executeSaySomething).");
        System.out.println("Oprócz danych, możemy również przekazywać kod, który na tych danych operuje!");
    */}
}