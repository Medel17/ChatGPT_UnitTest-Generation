import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VectorAverageFloatTest {

    @Test
    public void testVectorAverage_floatWithPositiveNumbers() {
        float[] input = {1.0f, 2.0f, 3.0f};
        float expected = 2.0f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of 1.0, 2.0, 3.0 should be 2.0");
    }

    @Test
    public void testVectorAverage_floatWithNegativeNumbers() {
        float[] input = {-1.0f, -2.0f, -3.0f};
        float expected = -2.0f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of -1.0, -2.0, -3.0 should be -2.0");
    }

    @Test
    public void testVectorAverage_floatWithMixedNumbers() {
        float[] input = {-1.0f, 2.0f, -3.0f, 4.0f};
        float expected = 0.5f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of -1.0, 2.0, -3.0, 4.0 should be 0.5");
    }

    @Test
    public void testVectorAverage_floatWithZeros() {
        float[] input = {0.0f, 0.0f, 0.0f};
        float expected = 0.0f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of 0.0, 0.0, 0.0 should be 0.0");
    }

    @Test
    public void testVectorAverage_floatWithSingleElement() {
        float[] input = {42.0f};
        float expected = 42.0f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of a single element 42.0 should be 42.0");
    }

    @Test
    public void testVectorAverage_floatWithEmptyArray() {
        float[] input = {};
        float expected = 0.0f;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of an empty array should be 0.0");
    }

    @Test
    public void testVectorAverage_floatWithLargeNumbers() {
        float[] input = {Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE};
        float expected = Float.MAX_VALUE;
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(expected, result, 0.001, "The average of large numbers should be Float.MAX_VALUE");
    }

    @Test
    public void testVectorAverage_floatWithInfinities() {
        float[] input = {Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY};
        float result = VectorAverageFloat.vectorAverage_float(input);
        assertEquals(Float.NaN, result, 0.001, "The average of positive and negative infinity should be NaN");
    }
}