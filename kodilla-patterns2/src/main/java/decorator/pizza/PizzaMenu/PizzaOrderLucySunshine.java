package decorator.pizza.PizzaMenu;

import decorator.pizza.AbstractPizzaOrderOrderDecorator;
import decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class PizzaOrderLucySunshine extends AbstractPizzaOrderOrderDecorator {
    public PizzaOrderLucySunshine(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , parmesan, artichokes, garlic, dollops of MOD red sauce";
    }
}
