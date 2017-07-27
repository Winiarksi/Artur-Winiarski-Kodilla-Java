package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println( "Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: END");
    }
    @BeforeClass // przypadki przed
    public static void beforeClass() {
        System.out.println("Test Suit: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println( "Test Suite: END");
    }
    @Test
    public void testCaseUsername(){
        // Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jon Snow" );
        //When
        String result = simpleUser.getUsername();
        System.out.println("testing1 " + result );
        //Then
        Assert.assertEquals( "theForumUser", result );
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jon Snow");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing2 " + result );
        //Then
        Assert.assertEquals("Jon Snow", result);
    }
}