package excercises.order;

public class OrderItem {
    private ProductType productType;    // produkt
    private double volume;              // ilość
    private double price;               // cena netto
    private double valueItem;           // wartość pozycji netto
    private double valueItemTax;        // wartość pozycji vat
    private double valueItemGross;      // wartość pozycji brutto

    public OrderItem(ProductType productType, double volume, double price, TaxType taxType) {
        this.productType = productType;
        this.volume = volume;
        this.price = price;
        this.valueItem = Utils.rounding(volume * price);
        this.valueItemTax = Utils.rounding(this.valueItem * Utils.taxValue(taxType) / 100);
        this.valueItemGross = Utils.rounding(this.valueItem + this.valueItemTax);
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

    public double getValueItemTax() {
        return valueItemTax;
    }

    public double getValueItemGross() {
        return valueItemGross;
    }

    @Override
    public String toString() {
        return "\n    {" +
                "'productType': '" + productType + "'" +
                ", 'volume': '" + volume + "'" +
                ", 'price': '" + price + "'" +
                ", 'valueItem': '" + valueItem + "'" +
                ", 'valueItemTax': '" + valueItemTax + "'" +
                ", 'valueItemGross': '" + valueItemGross + "'" +
                '}';
    }
}

