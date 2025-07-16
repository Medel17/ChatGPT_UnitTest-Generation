import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NegativeToZeroTest {

    @Test
    public void testWithAllNegativeValues() {
        int[] input = {-1, -2, -3};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithAllPositiveValues() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithMixedValues() {
        int[] input = {-1, 2, -3, 4, 0};
        int[] expected = {0, 2, 0, 4, 0};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithZeros() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithSingleNegativeValue() {
        int[] input = {-5};
        int[] expected = {0};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithSinglePositiveValue() {
        int[] input = {5};
        int[] expected = {5};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }

    @Test
    public void testWithSingleZeroValue() {
        int[] input = {0};
        int[] expected = {0};
        assertArrayEquals(expected, NegativeToZero.negativeToZero(input));
    }
}