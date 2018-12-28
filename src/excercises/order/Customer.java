package excercises.order;

public class Customer {
    private String name;
    private String city;
    private String postalCode;
    private String street;
    private String houseNum;
    private String locumNum;

    public Customer(String name, String city, String postalCode, String street, String houseNum, String locumNum) {

        this.name = name;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNum = houseNum;
        this.locumNum = locumNum;
    }

    @Override
    public String toString() {
        return "\n {" +
                "'name': '" + name + "'" +
                ", 'city': '" + city + "'" +
                ", 'postalCode': '" + postalCode + "'" +
                ", 'street': '" + street + "'" +
                ", 'houseNum': '" + houseNum + "'" +
                ", 'locumNum': '" + locumNum + "'" +
                '}';
    }
}
