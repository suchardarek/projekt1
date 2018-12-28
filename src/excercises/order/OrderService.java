package excercises.order;

import java.util.List;

import static excercises.order.Utils.*;
import static excercises.order.Utils.generateOrderNumber;

public class OrderService {

    public Customer createNewCustomer(String name, String city, String postalCode, String street, String houseNum, String locumNum) {
        if (isEmpty(name) || isEmpty(city) || isEmpty(postalCode) || isEmpty(street) || isEmpty(houseNum) || isEmpty(locumNum)) {
            throw new IllegalArgumentException("Cannot be empty");
        }
        if(isPostalCode(postalCode)) {
            throw new IllegalArgumentException("Not postal code " + postalCode + " (00-000)");
        }
        return new Customer(name, city, postalCode, street, houseNum, locumNum);
    }

    public OrderItem createNewOrderItem(ProductType productType, double volume, double price, TaxType taxType) {
        if (volume == 0 || price == 0) {
            throw new IllegalArgumentException("Volume and price cannot be 0");
        }
        return new OrderItem(productType, volume, price, taxType);
    }

    public Order createNewOrder(Customer customer, List<OrderItem> orderItems) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (orderItems == null || orderItems.size() == 0) {
            throw new IllegalArgumentException("OrderItem cannot be empty");
        }

        return new Order(generateOrderNumber(), generateVehicle(), customer, orderItems);
    }
}
