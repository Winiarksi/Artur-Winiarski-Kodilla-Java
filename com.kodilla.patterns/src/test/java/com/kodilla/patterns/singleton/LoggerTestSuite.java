package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private Logger logger;

    @BeforeClass
    public static void openOperation(){
        System.out.println("Zabawa w testowanie rozpoczęta. Torrtury czas zacząć! ");
        Logger.getInstance().log("Tango Milonga");
    }

    @AfterClass
    public static void closeOperation(){
        System.out.println("Zamykamy przedstawienie.");
    }

    @Test
    public void testLog(){
        // Given & When
        String lastLog = logger.getInstance().getLastLog();
        System.out.println("Log pobrany.");

        // Then
        Assert.assertEquals("Tango Milonga", lastLog);
    }
}
