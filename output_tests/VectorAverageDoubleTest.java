import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class VectorAverageDoubleTest {

    @Test
    public void testVectorAverage_doubleWithEmptyArray() {
        double[] emptyArray = {};
        double result = VectorAverageDouble.vectorAverage_double(emptyArray);
        assertEquals(0, result, "The average of an empty array should be 0.");
    }

    @Test
    public void testVectorAverage_doubleWithSingleElement() {
        double[] singleElementArray = {5.0};
        double result = VectorAverageDouble.vectorAverage_double(singleElementArray);
        assertEquals(5.0, result, "The average of a single element array should be the element itself.");
    }

    @Test
    public void testVectorAverage_doubleWithMultipleElements() {
        double[] multipleElementsArray = {1.0, 2.0, 3.0, 4.0};
        double result = VectorAverageDouble.vectorAverage_double(multipleElementsArray);
        assertEquals(2.5, result, "The average of the array {1.0, 2.0, 3.0, 4.0} should be 2.5.");
    }

    @Test
    public void testVectorAverage_doubleWithNegativeValues() {
        double[] negativeValuesArray = {-1.0, -2.0, -3.0, -4.0};
        double result = VectorAverageDouble.vectorAverage_double(negativeValuesArray);
        assertEquals(-2.5, result, "The average of the array {-1.0, -2.0, -3.0, -4.0} should be -2.5.");
    }

    @Test
    public void testVectorAverage_doubleWithMixedValues() {
        double[] mixedValuesArray = {-1.0, 2.0, -3.0, 4.0};
        double result = VectorAverageDouble.vectorAverage_double(mixedValuesArray);
        assertEquals(0.5, result, "The average of the array {-1.0, 2.0, -3.0, 4.0} should be 0.5.");
    }

    @Test
    public void testVectorAverage_doubleWithHighPrecision() {
        double[] highPrecisionArray = {1.111, 2.222, 3.333};
        double result = VectorAverageDouble.vectorAverage_double(highPrecisionArray);
        assertEquals(2.222, result, 0.0001, "The average of the array {1.111, 2.222, 3.333} should be approximately 2.222.");
    }

    @Test
    public void testVectorAverage_doubleWithLargeNumbers() {
        double[] largeNumbersArray = {1e9, -1e9, 1e9};
        double result = VectorAverageDouble.vectorAverage_double(largeNumbersArray);
        assertEquals(1e9 / 3, result, "The average of the array {1e9, -1e9, 1e9} should be approximately 1e9/3.");
    }
}