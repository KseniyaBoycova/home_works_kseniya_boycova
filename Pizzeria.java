package ControlWork;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Pizzeria implements IPizzeria{
    private Map<Receipt, Order> orders;
    private int currentOrderId;
    private Menu menu;

    public Pizzeria() {
        this.orders = new HashMap<>();
        this.currentOrderId = 1;
        this.menu = new Menu();
    }

    @Override
    public Menu getMenu() {
        return menu;
    }

    @Override
    public Receipt currentOrder(Order order) {
        Receipt receipt = new Receipt(LocalTime.now(), currentOrderId++);
        orders.put(receipt, order);
        return receipt;
    }

    public int getCurrentOrderId(){
        return currentOrderId;
    }

    @Override
    public Map<Receipt, List<String>> getOrderStages() {
        Map<Receipt, List<String>> stages = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        for (Receipt receipt : orders.keySet()) {
            stages.put(receipt, Arrays.asList(
                    "Заказ принят " + receipt.getIssueTime().format(formatter),
                    "Начато приготовление пиццы " + receipt.getIssueTime().plusMinutes(2).format(formatter),
                    "Заказ пакуется " + receipt.getIssueTime().plusMinutes(11).format(formatter),
                    "Заказ готов " + receipt.getIssueTime().plusMinutes(12).format(formatter)));
        }
        return stages;
    }

    @Override
    public Order getOrder(Receipt receipt) {
        return orders.remove(receipt);
    }
}
