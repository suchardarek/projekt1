package excercises.car;

public abstract class Vehicle implements VehicleTypeEnabled, Driveable {

    private String regisrationNumber;
    private String vin;
    private Color color;
    private Engine engine;           //silnik
    private double priceRent;        // cena wynajęcia
    private double combustion;       //spalanie
    private double fuelTankPercent;  //stan zbiornika [%]
    private double vehicleMileage;   //przebieg

    @Override
    public void drive() {
        if (getFuelTankPercent() > 0) {
            setFuelTankPercent(getFuelTankPercent() - 1);
            setVehicleMileage(getVehicleMileage() + 10);
        } else {
            System.out.println("Brak paliwa");
        }
    }

    public String getRegisrationNumber() {
        return regisrationNumber;
    }

    public void setRegisrationNumber(String regisrationNumber) {
        this.regisrationNumber = regisrationNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public double getFuelTankPercent() {
        return fuelTankPercent;
    }

    public void setFuelTankPercent(double fuelTankPercent) {
        this.fuelTankPercent = fuelTankPercent;
    }

    public double getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(double vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }
}
