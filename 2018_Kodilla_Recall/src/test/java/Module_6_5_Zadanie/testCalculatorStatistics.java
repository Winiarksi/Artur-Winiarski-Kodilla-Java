package Module_6_5_Zadanie;

import Module_6.Module_6_5_Zadanie.CalculatorStatistics;
import Module_6.Module_6_5_Zadanie.Statistics;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testCalculatorStatistics {

    public static int count;

    @Before
    public void testBefore(){
        System.out.println("\nTest nr: " + (++count) + "\n");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Testy zadania z Modułu 6.5");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Testy Modułu nr 6.5 zakońcone. \n" +
                "Wykonane testy: " + count);
    }

    @Test // nr 1
    public void testCalculateAdvStatistics(){
         // Given
        Statistics statistics = mock(Statistics.class);

        List<String> userName = new ArrayList<String>();
        userName.add("Jasiu");
        userName.add("Małgosia");
        userName.add("Migotka");
        userName.add("Rumcajs");
        userName.add("Stefan");

        when(statistics.userName()).thenReturn(userName);
        when(statistics.postCount()).thenReturn(4);
        when(statistics.comentstCount()).thenReturn(50);

        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();

        // When
        calculatorStatistics.caclulateAdvStatistics(statistics);
//        calculatorStatistics.showStatistics();

        // Then
        assertEquals(0.8, calculatorStatistics.getAverageNumberOfPostsPerUser());
        assertEquals(10.0, calculatorStatistics.getAverageNumberOfCommentsPerUser());
        assertEquals(12.5, calculatorStatistics.getAverageNumberOfCommentsPerPost());

    }

    @Test
    public void testCalculateAdvStatisticsZero(){
        // Given
        Statistics statistics = mock(Statistics.class);

        List<String> userName = new ArrayList<String>();
        userName.add("Jasiu");
        userName.add("Małgosia");
        userName.add("Migotka");
        userName.add("Rumcajs");
        userName.add("Stefan");

        when(statistics.userName()).thenReturn(userName);
        when(statistics.postCount()).thenReturn(0);
        when(statistics.comentstCount()).thenReturn(50);

        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();

        // When
        calculatorStatistics.caclulateAdvStatistics(statistics);
        calculatorStatistics.showStatistics();

        // Then

        assertEquals(0.0, calculatorStatistics.getAverageNumberOfPostsPerUser());
        assertEquals(10.0, calculatorStatistics.getAverageNumberOfCommentsPerUser());
        assertEquals(Infinity, calculatorStatistics.getAverageNumberOfCommentsPerPost());



    }

}
