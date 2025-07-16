import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VectorAverageIntTest {

    @Test
    public void testVectorAverageWithSingleElement() {
        int[] array = {5};
        assertEquals(5, VectorAverageInt.vectorAverage_int(array));
    }

    @Test
    public void testVectorAverageWithMultipleElements() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, VectorAverageInt.vectorAverage_int(array));
    }

    @Test
    public void testVectorAverageWithNegativeNumbers() {
        int[] array = {-5, -10, -15};
        assertEquals(-10, VectorAverageInt.vectorAverage_int(array));
    }

    @Test
    public void testVectorAverageWithMixedNumbers() {
        int[] array = {-10, 0, 10, 20};
        assertEquals(5, VectorAverageInt.vectorAverage_int(array));
    }

    @Test
    public void testVectorAverageWithZeroLengthArray() {
        int[] array = {};
        assertEquals(0, VectorAverageInt.vectorAverage_int(array));
    }

    @Test
    public void testVectorAverageWithLargeNumbers() {
        int[] array = {1000000, 2000000, 3000000};
        assertEquals(2000000, VectorAverageInt.vectorAverage_int(array));
    }
}