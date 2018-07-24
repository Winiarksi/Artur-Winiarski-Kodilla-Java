package com.kodilla.testing.aw_test;

import com.kodilla.testing.aw_test_first.SimpleUser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class aw_test {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }

    @AfterClass
    public static void afterClass(){
        System.out.print("AfterClass");
    }

    @Test
    public void testFirst(){
    // Given
    SimpleUser simpleUser = new SimpleUser("ABC", "CDA");
    // When
    String answer = simpleUser.getRealName();
    System.out.println(answer);
    //Then
    assertEquals("CDA", answer);
}

    @Test
    public void testSecond(){
        //Given
        SimpleUser simpleUser = new SimpleUser("ABC", "CDA");

        //When
        String answer = simpleUser.getUsername();
        System.out.println(answer);

        //Then
        assertEquals("ABC", answer);
    }

}
