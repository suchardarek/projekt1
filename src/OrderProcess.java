import excercises.order.*;

import java.util.ArrayList;
import java.util.List;

public class OrderProcess {


    public void start() {
        OrderService orderService = new OrderService();

        Customer customer = new Customer("Jan Kowalski", "Warszawa", "01-461", "Dębicka", "7", "8");

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderService.createNewOrderItem(ProductType.ON, 1_500, 4.52));
        orderItems.add(orderService.createNewOrderItem(ProductType.Pb95, 2_350, 1.75));

        Order order = orderService.createNewOrder(customer, orderItems);

        System.out.println("Order: " + order);

    }

}

