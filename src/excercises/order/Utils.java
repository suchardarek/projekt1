package excercises.order;
import excercises.car.Vehicle;

import java.util.Random;

public abstract class Utils {

    private static final String POSTAL_CODE_PATTERN = "^[0-9]{2}-[0-9]{3}$";

    public static boolean isEmpty(String text) {
        return text == null || text.trim().length() == 0;
    }

    public static String generateOrderNumber() {
        return String.valueOf(new Random().nextInt(1_000));
    }

    public static boolean isPostalCode(String postalCode) {
        return !postalCode.trim().matches(POSTAL_CODE_PATTERN);
    }

    public static byte taxValue (TaxType taxType){
        if (taxType == TaxType._0) { return 0;}
        else if (taxType == TaxType._8) { return 8;}
        else {return 23;}
    }

    public static double rounding (double number){
        number *= 100;
        number = Math.round(number);
        number /= 100;
        return number;
    }

    public static VehicleType generateVehicle() {
        int pick = new Random().nextInt(VehicleType.values().length);
        return VehicleType.values()[pick];
    }
}
