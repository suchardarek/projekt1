package excercises.order;

public class OrderItem {
    private ProductType productType;    // produkt
    private double volume;      // ilość
    private double price;       // cena
    private double valueItem;   // wartość pozycji

    public OrderItem(ProductType productType, double volume, double price) {
        this.productType = productType;
        this.volume = volume;
        this.price = price;
        this.valueItem = volume * price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public double getValueItem() {
        return valueItem;
    }

    @Override
    public String toString() {
        return "\nOrderItem{" +
                "productType=" + productType +
                ", volume=" + volume +
                ", price=" + price +
                ", valueItem=" + valueItem +
                '}';
    }
}

