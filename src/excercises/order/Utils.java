package excercises.order;

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

}
