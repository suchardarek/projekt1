package excercises.car;

public class PassengerCar extends Vehicle {

    private int doorCount;

    @Override
    public VehicleType getType() {
        return VehicleType.PASSENGER_CAR;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

}
