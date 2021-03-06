package decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getPizzaDescription() {
        return pizzaOrder.getPizzaDescription();
    }
}
