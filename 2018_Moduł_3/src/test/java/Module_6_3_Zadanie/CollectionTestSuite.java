package Module_6_3_Zadanie;

import Module_6.Module_6_3_Zadanie.OddNumersExterminator;
import Module_6.Module_6_3_Zadanie.Tool;
import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.printf("** Moduł 6.3, Rozpoczęcie testu **\n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.printf("** Modul 6.3, Zakończenie testu **\n");
    }



    @Test
    public void testOddNumbersExteminatorNormalList(){

        // Given
        OddNumersExterminator oddNumersExterminator = new OddNumersExterminator();
        Tool tool = new Tool(10, 10);
        boolean enswer = false;

        // When
        System.out.println(tool.makeLoop().size());
//        enswer = tool.checkEven(oddNumersExterminator.extermiante(tool.makeLoop()));
        enswer = tool.checkEven(oddNumersExterminator.extermiante(tool.makeLoop()));

        // Then
        Assert.assertTrue(enswer);
    }

    @Test
    public void testOddNumbersExterminateorEmptyList(){

        // Given
        OddNumersExterminator oddNumersExterminator = new OddNumersExterminator();
        Tool tool = new Tool(0, 10);
        boolean enswer = false;

        // When
        tool.checkEven(oddNumersExterminator.extermiante(tool.makeLoop()));
        enswer = oddNumersExterminator.getListEven().isEmpty();

        // Then
        Assert.assertTrue(enswer);
    }
}
