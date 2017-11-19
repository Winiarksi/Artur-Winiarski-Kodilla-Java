package decorator.pizza.PizzaMenu;

import decorator.pizza.AbstractPizzaOrderOrderDecorator;
import decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class PizzaOrderMadDogDecorator extends AbstractPizzaOrderOrderDecorator {
    public PizzaOrderMadDogDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , pepperoni, mild sausage, ground beef, MOD ted sauce";
    }
}
