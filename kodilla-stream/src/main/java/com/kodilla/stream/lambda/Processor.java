package com.kodilla.stream.lambda;
    // posiada metodę execute(Executor executor),
         // przyjmującą jako argument obiekt dowolnej klasy implementującej interfejs Executor.
public class Processor {
    public void execute(Executor executor) {
        executor.process();
    }
}