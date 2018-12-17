package excercises.order;

import java.util.List;

public class Order {
    private String orderNumber;            // numer zamówienia
    private Customer customer;             // klient
    private List<OrderItem> orderItems;    // pozycje zamówienia
    private double value;                 // wartość zamówienia

    public Order(String orderNumber, Customer customer, List<OrderItem> orderItems) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderItems = orderItems;
        for (OrderItem orderItem : orderItems) {
            value += orderItem.getValueItem();
        }
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customer=" + customer +
                ", orderItems=" + orderItems +
                ", \nvalue=" + value +
                '}';
    }
}
