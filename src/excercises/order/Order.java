package excercises.order;

import java.util.List;

public class Order {
    private String orderNumber;            // numer zamówienia
    private Customer customer;             // klient
    private VehicleType vehicle;           // auto do przewozu
    private List<OrderItem> orderItems;    // pozycje zamówienia
    private double value;                  // wartość zamówienia netto
    private double valueTax;               // wartość zamówienia vat
    private double valueGross;             // wartość zamówienia brutto

    public Order(String orderNumber, VehicleType vehicle, Customer customer, List<OrderItem> orderItems) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.orderItems = orderItems;

        for (OrderItem orderItem : orderItems) {
            value += orderItem.getValueItem();
            valueTax += orderItem.getValueItemTax();
            valueGross += orderItem.getValueItemGross();
        }
        value = Utils.rounding(value);
        valueTax = Utils.rounding(valueTax);
        valueGross = Utils.rounding(valueGross);

    }

    @Override
    public String toString() {
        return "{" +
                "'orderNumber': '" + orderNumber + "'" +
                ", 'customer': " + customer +
                ", 'vehicle': '" + vehicle + "'" +
                ", 'orderItems': " + orderItems +
                ", \n'Order value': '" + value + "'" +
                ", \n'Order valueTax': '" + valueTax + "'" +
                ", \n'Order valueGross': '" + valueGross + "'" +
                '}';
    }
}
