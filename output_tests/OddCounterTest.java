import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OddCounterTest {

    @Test
    public void testCountOdds_withAllOdds() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(5, OddCounter.countOdds(arr), "All elements are odd, should return count of 5");
    }

    @Test
    public void testCountOdds_withNoOdds() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(0, OddCounter.countOdds(arr), "No odd elements, should return count of 0");
    }

    @Test
    public void testCountOdds_withMixedElements() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, OddCounter.countOdds(arr), "Three odd elements, should return count of 3");
    }

    @Test
    public void testCountOdds_withNegativeOdds() {
        int[] arr = {-1, -3, -5, -7, -9};
        assertEquals(5, OddCounter.countOdds(arr), "Negative odd elements, should return count of 5");
    }

    @Test
    public void testCountOdds_withNegativeEvens() {
        int[] arr = {-2, -4, -6, -8, -10};
        assertEquals(0, OddCounter.countOdds(arr), "Negative even elements, should return count of 0");
    }

    @Test
    public void testCountOdds_withEmptyArray() {
        int[] arr = {};
        assertEquals(0, OddCounter.countOdds(arr), "Empty array, should return count of 0");
    }

    @Test
    public void testCountOdds_withSingleOddElement() {
        int[] arr = {3};
        assertEquals(1, OddCounter.countOdds(arr), "Single odd element, should return count of 1");
    }

    @Test
    public void testCountOdds_withSingleEvenElement() {
        int[] arr = {2};
        assertEquals(0, OddCounter.countOdds(arr), "Single even element, should return count of 0");
    }

    @Test
    public void testCountOdds_withZeros() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, OddCounter.countOdds(arr), "Zeros are even, should return count of 0");
    }
}