import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDArrayTest {

    @Test
    public void testGcdArrayWithPositiveNumbers() {
        int[] arr = {8, 12, 16};
        assertEquals(4, GCDArray.gcd_array(arr), "GCD of positive numbers should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithNegativeNumbers() {
        int[] arr = {-8, -12, -16};
        assertEquals(4, GCDArray.gcd_array(arr), "GCD of negative numbers should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithMixedNumbers() {
        int[] arr = {-8, 12, 16};
        assertEquals(4, GCDArray.gcd_array(arr), "GCD of mixed numbers should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithZero() {
        int[] arr = {0, 12, 16};
        assertEquals(4, GCDArray.gcd_array(arr), "GCD when array contains zero should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithAllZeros() {
        int[] arr = {0, 0, 0};
        assertEquals(0, GCDArray.gcd_array(arr), "GCD of all zeros should be zero.");
    }

    @Test
    public void testGcdArrayWithOneElement() {
        int[] arr = {25};
        assertEquals(25, GCDArray.gcd_array(arr), "GCD of a single element array should be the element itself.");
    }

    @Test
    public void testGcdArrayWithTwoElements() {
        int[] arr = {100, 25};
        assertEquals(25, GCDArray.gcd_array(arr), "GCD of two elements should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithOneNegativeOnePositive() {
        int[] arr = {-100, 25};
        assertEquals(25, GCDArray.gcd_array(arr), "GCD of one negative and one positive should be calculated correctly.");
    }

    @Test
    public void testGcdArrayWithAllOnes() {
        int[] arr = {1, 1, 1};
        assertEquals(1, GCDArray.gcd_array(arr), "GCD of all ones should be one.");
    }

    @Test
    public void testGcdArrayWithNoElements() {
        int[] arr = {};
        assertEquals(0, GCDArray.gcd_array(arr), "GCD of an empty array should be zero.");
    }
}