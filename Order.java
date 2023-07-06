package ControlWork;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzasInOrder;

    public Order() {
        pizzasInOrder = new ArrayList<>();
    }

    public void addPizzaToOrder(Pizza pizza) {
        pizzasInOrder.add(pizza);
    }

    public List<Pizza> getPizzasInOrder() {
        return pizzasInOrder;
    }

}
