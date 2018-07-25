package Module_6_3;

import Module_6.Module_6_3.SimpleUser_6_3;
import org.junit.*;

public class ForumTestSuit {

    @BeforeClass
    public static void  beforeClass(){
        System.out.println("\nTesty do Modułu 6.3\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\nTesty Modułu 6.3 zakończone");
    }

//    @Ignore
    @Test
    public void testCaseUserName(){
    // Givevn
        SimpleUser_6_3 simple = new SimpleUser_6_3("theToIOwo", "toITamto");

    // When
        String result = simple.getUserName();

    // Then
        Assert.assertEquals("theToIOwo", result);
        Assert.assertNotEquals("toITamtoIOwamto", result);
    }

}
