package ControlWork;

import java.util.List;
import java.util.Map;

public interface IPizzeria {
    Menu getMenu();
    Receipt currentOrder(Order order);
    Map<Receipt, List<String>> getOrderStages();
    Order getOrder(Receipt receipt);
}
