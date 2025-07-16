import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleComparisonsTest {

    @Test
    public void testBothA1GreaterAndB1Smaller() {
        assertEquals(3, MultipleComparisons.multipleComparisons(5, 3, 1, 4));
    }

    @Test
    public void testBothA2GreaterAndB2Smaller() {
        assertEquals(1, MultipleComparisons.multipleComparisons(3, 5, 4, 1));
    }

    @Test
    public void testA1EqualsA2AndB1EqualsB2() {
        assertEquals(0, MultipleComparisons.multipleComparisons(5, 5, 5, 5));
    }

    @Test
    public void testA1GreaterA2AndB1EqualsB2() {
        assertEquals(4, MultipleComparisons.multipleComparisons(6, 2, 2, 2));
    }

    @Test
    public void testA1EqualsA2AndB1LessThanB2() {
        assertEquals(3, MultipleComparisons.multipleComparisons(4, 4, 1, 2));
    }

    @Test
    public void testNegativeNumbersWithA1Greater() {
        assertEquals(-1, MultipleComparisons.multipleComparisons(-2, -5, -3, -4));
    }

    @Test
    public void testNegativeNumbersWithB1Smaller() {
        assertEquals(-2, MultipleComparisons.multipleComparisons(-5, -3, -1, -2));
    }

    @Test
    public void testMixedPositiveAndNegativeNumbers() {
        assertEquals(10, MultipleComparisons.multipleComparisons(5, 3, -2, -5));
    }

    @Test
    public void testZeroValues() {
        assertEquals(5, MultipleComparisons.multipleComparisons(0, 5, 0, 0));
    }
}