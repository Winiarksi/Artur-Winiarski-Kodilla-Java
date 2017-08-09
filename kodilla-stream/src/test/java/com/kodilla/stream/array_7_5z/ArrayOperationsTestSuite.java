package com.kodilla.stream.array_7_5z;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        // Give
       // ArrayOperations.getAverage(new int[]{0, 1, 20, 3, 4});

        // When
        double result = ArrayOperations.getAverage(new int[]{0, 1, 20, 3, 4});

        // Then
        Assert.assertEquals(5.6, result, 0.1);
    }
}
