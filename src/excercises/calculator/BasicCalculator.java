package excercises.calculator;

/**
 * @author Maciej.Scislowski@gmail.com
 */
public interface BasicCalculator {

    BasicCalculator reset();

    String getResult();

    BasicCalculator add(double value);

    BasicCalculator subtract(double value);

    BasicCalculator multiply(double value);

    BasicCalculator divide(double value);


}
