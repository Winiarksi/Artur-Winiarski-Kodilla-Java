package decorator.pizza.PizzaMenu;

import decorator.pizza.AbstractPizzaOrderOrderDecorator;
import decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class PizzaOrderDominicDecorator extends AbstractPizzaOrderOrderDecorator {
    public PizzaOrderDominicDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , withe sauce, asiago cheese, fresh chopped basil, red  onion, sliced tomatoes, mild sausage";
    }
}
