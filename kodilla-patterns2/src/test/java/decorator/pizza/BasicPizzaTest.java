package decorator.pizza;

import decorator.pizza.PizzaMenu.PizzaOrderDominicDecorator;
import decorator.pizza.PizzaMenu.PizzaOrderLucySunshine;
import decorator.pizza.PizzaMenu.PizzaOrderMadDogDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasicPizzaTest {
    @Test
    public void testPizzaOrderDominicGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDominicDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatorPrice);
    }

    @Test
    public void testPizzaOrderDominicGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDominicDecorator(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , withe sauce, asiago cheese, fresh chopped basil, red  onion, sliced tomatoes, mild sausage", pizzaName);

    }

    @Test
    public void testPizzaOrderLucySunshineGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDominicDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatorPrice);
    }

    @Test
    public void testPizzaOrderLucySunshineDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderLucySunshine(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , parmesan, artichokes, garlic, dollops of MOD red sauce", pizzaName);
    }


    @Test
    public void testPizzaOrderMadDogDecoratorGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderMadDogDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(22), calculatorPrice);
    }

    @Test
    public void testPizzaOrderMadDogDecoratorDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderMadDogDecorator(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , pepperoni, mild sausage, ground beef, MOD ted sauce", pizzaName);

    }


}