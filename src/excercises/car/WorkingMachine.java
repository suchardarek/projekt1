package excercises.car;

public class WorkingMachine extends Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.WORKING_MACHINE;
    }

    @Override
    public void drive() {
        if (getFuelTankPercent() > 0) {
            double result = getFuelTankPercent() == 1 ? 1 : 2;
            setFuelTankPercent(result);
            setVehicleMileage(getVehicleMileage() + 2.5 * result);
        } else {
            System.out.println("Brak paliwa");
        }
    }

}
