package ControlWork;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Pizza> pizzas;

    public Menu() {
        pizzas = new HashMap<>();
        pizzas.put("Маргарита", new PizzaMargarita());
        pizzas.put("Пепперони", new PizzaPepperoni());
        pizzas.put("Четыре сыра", new Pizza4Cheese());
    }

    public Map<String, Pizza> getPizzas() {
        return pizzas;
    }
}
