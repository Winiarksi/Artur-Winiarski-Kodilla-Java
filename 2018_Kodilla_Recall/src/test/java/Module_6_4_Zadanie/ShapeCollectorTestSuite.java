package Module_6_4_Zadanie;

import Module_6.Module_6_4_Zadanie.ShapeCollector;
import Module_6.Module_6_4_Zadanie.Shapes.Circle;
import Module_6.Module_6_4_Zadanie.Shapes.Rectangle;
import Module_6.Module_6_4_Zadanie.Shapes.Triangle;
import org.junit.*;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    private static int count = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Rozpoczęcie testów Modułu 6.4\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\nKoniec testó Modułu 6.4 ");
        System.out.println("Dziękuję za uwagę ;) ");
    }

    @Before
    public void testInfo(){
        System.out.println("Rozpoczęcie testu nr: " + (++count) + "\n");
    }

    @Test //nr 1
    public void testAddFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        // When
        shapeCollector.addFigure(new Triangle(26.0, 8.40));
        shapeCollector.addFigure(new Triangle(20.21, 7.18));
        shapeCollector.addFigure(new Circle(45.12));

        // Then
        assertTrue(shapeCollector.getFigure(0) instanceof Triangle);
        assertTrue(shapeCollector.getFigure(2).sourfaceArea() > 0 );
    }

//    @Ignore
    @Test //nr 2
    public void testRemoveFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Rectangle rectangle= new Rectangle(10, 20);

        shapeCollector.addFigure(new Triangle(26.0, 8.40));
        shapeCollector.addFigure(new Triangle(20.21, 7.18));
        shapeCollector.addFigure(new Circle(45.12));
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(new Rectangle(10, 20));

        // When
        shapeCollector.removeFigure(rectangle);

        // Then
        assertTrue(shapeCollector.getListShape().size() == 4);
    }

//    @Ignore
    @Test //nr 3
    public void testGetFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();

        // When
        shapeCollector.addFigure(new Circle(92));
        shapeCollector.addFigure(new Circle(102));
        shapeCollector.addFigure(new Circle(1002));
        shapeCollector.addFigure(new Rectangle(10, 20));
        shapeCollector.addFigure(new Triangle(20.21, 7.18));

        // Then
        assertTrue(shapeCollector.getFigure(2).sourfaceArea() > 0);
    }

//    @Ignore
    @Test //nr 4
    public void testShowFigures(){
        count++;
        // Given && When
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(92));
        shapeCollector.addFigure(new Circle(102));
        shapeCollector.addFigure(new Circle(1002));
        shapeCollector.addFigure(new Rectangle(10, 20));
        shapeCollector.addFigure(new Triangle(20.21, 7.18));

        // Then
        assertTrue(shapeCollector.showFigures());
    }
}
