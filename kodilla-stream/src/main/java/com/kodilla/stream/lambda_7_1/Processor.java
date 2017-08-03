package com.kodilla.stream.lambda_7_1;
    // posiada metodę execute(Executor executor),
         // przyjmującą jako argument obiekt dowolnej klasy implementującej interfejs Executor.
public class Processor {
    public void execute(Executor executor) {
        executor.process();
    }
}