package excercises.order;

import java.util.List;

public class OrderService {

    public OrderItem createNewOrderItem(ProductType productType, double volume, double price) {
        if (volume == 0 || price == 0) {
            throw new IllegalArgumentException("Volume and price cannot be 0");
        }
        return new OrderItem(productType, volume, price);
    }

    public Order createNewOrder(Customer customer, List<OrderItem> orderItems) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (orderItems == null || orderItems.size() == 0) {
            throw new IllegalArgumentException("OrderItem cannot be empty");
        }
        String orderNumber = Utils.generateOrderNumber();

        return new Order(orderNumber, customer, orderItems);
    }
}
