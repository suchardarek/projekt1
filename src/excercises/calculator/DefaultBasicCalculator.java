package excercises.calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author Maciej.Scislowski@gmail.com
 */
public class DefaultBasicCalculator implements BasicCalculator {

    private static final int SCALE = 2;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00");
    private BigDecimal result;

    public DefaultBasicCalculator() {
        this.result = new BigDecimal(0);
    }

    @Override
    public BasicCalculator reset() {
        result = new BigDecimal(0);
        return this;
    }

    @Override
    public String getResult() {
        return DECIMAL_FORMAT.format(result.doubleValue());
    }

    @Override
    public BasicCalculator add(double value) {
        result = result.add(new BigDecimal(value));
        return this;
    }

    @Override
    public BasicCalculator subtract(double value) {
        result = result.subtract(new BigDecimal(value));
        return this;
    }

    @Override
    public BasicCalculator multiply(double value) {
        result = result.multiply(new BigDecimal(value));
        return this;
    }

    @Override
    public BasicCalculator divide(double value) {
        try {
            result = result.divide(new BigDecimal(value), SCALE, BigDecimal.ROUND_HALF_UP);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
//            e.printStackTrace();
        }
        return this;
    }

}
