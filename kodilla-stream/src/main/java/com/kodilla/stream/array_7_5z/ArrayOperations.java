package com.kodilla.stream.array_7_5z;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(table -> System.out.println("INT: " + numbers[table]));

        double avergardeTable = IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average().getAsDouble();

        System.out.println("avergardeList: " + avergardeTable);

        return avergardeTable;
    }
}
