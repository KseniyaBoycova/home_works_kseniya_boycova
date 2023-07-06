package ControlWork;

import java.util.List;
import java.util.Map;

public class Customer {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        System.out.println("Меню пиццерии:");
        Map<String, Pizza> pizzas = pizzeria.getMenu().getPizzas();
        for(String pizzaName : pizzas.keySet()) {
            System.out.println(pizzaName);
        }

        Order order = new Order();
        order.addPizzaToOrder(pizzeria.getMenu().getPizzas().get("Маргарита"));
        order.addPizzaToOrder(pizzeria.getMenu().getPizzas().get("Четыре сыра"));

        Receipt receipt = pizzeria.currentOrder(order);
        System.out.println("Номер заказа: "+pizzeria.getCurrentOrderId());

        List<String> orderStages = pizzeria.getOrderStages().get(receipt);
        for(String stage : orderStages) {
            System.out.println(stage);
        }

        Order completedOrder = pizzeria.getOrder(receipt);
        System.out.println("Заказ выполнен. Заказанные пиццы:");
        List<Pizza> orderedPizzas = completedOrder.getPizzasInOrder();
        for(Pizza pizza : orderedPizzas) {
            System.out.println(pizza.getName());
        }
    }
}
