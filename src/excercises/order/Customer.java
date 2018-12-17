package excercises.order;

import static excercises.order.Utils.isEmpty;
import static excercises.order.Utils.isPostalCode;

public class Customer {

    private String name;
    private String city;
    private String postalCode;
    private String street;
    private String houseNum;
    private String locumNum;

    public Customer(String name, String city, String postalCode, String street, String houseNum, String locumNum) {
        if (isEmpty(name) || isEmpty(city) || isEmpty(postalCode) || isEmpty(street) || isEmpty(houseNum) || isEmpty(locumNum)) {
            throw new IllegalArgumentException("Cannot be empty");
        }
        if(isPostalCode(postalCode)) {
            throw new IllegalArgumentException("Not postal code " + postalCode + " (00-000)");
        }

        this.name = name;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNum = houseNum;
        this.locumNum = locumNum;
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", houseNum='" + houseNum + '\'' +
                ", locumNum='" + locumNum + '\'' +
                '}';
    }
}
