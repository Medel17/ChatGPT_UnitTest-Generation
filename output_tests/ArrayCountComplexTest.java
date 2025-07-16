import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCountComplexTest {

    @Test
    public void testAllPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        assertEquals(5, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testMixedNumbers() {
        int[] array = {-1, 2, -3, 4, 5};
        assertEquals(1, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(0, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testEqualPositiveAndNegativeNumbers() {
        int[] array = {-1, 1, -2, 2};
        assertEquals(0, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testSingleElementPositive() {
        int[] array = {1};
        assertEquals(1, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testSingleElementNegative() {
        int[] array = {-1};
        assertEquals(1, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testZerosOnly() {
        int[] array = {0, 0, 0, 0};
        assertEquals(0, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testPositiveGreaterNegative() {
        int[] array = {1, 2, 3, -1};
        assertEquals(2, ArrayCountComplex.arrayCountComplex(array));
    }

    @Test
    public void testNegativeGreaterPositive() {
        int[] array = {-1, -2, -3, 1};
        assertEquals(2, ArrayCountComplex.arrayCountComplex(array));
    }
}