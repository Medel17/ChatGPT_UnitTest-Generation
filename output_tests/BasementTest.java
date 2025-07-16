import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BasementTest {

    @Test
    public void testBasementWithNegativeSumEarly() {
        int[] input = {5, -10, 3, 2};
        int expected = 1;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithNoNegativeSum() {
        int[] input = {1, 2, 3, 4};
        int expected = -1;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithAllNegatives() {
        int[] input = {-1, -2, -3, -4};
        int expected = 0;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithEmptyArray() {
        int[] input = {};
        int expected = -1;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithSingleElementPositive() {
        int[] input = {5};
        int expected = -1;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithSingleElementNegative() {
        int[] input = {-5};
        int expected = 0;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithZeroes() {
        int[] input = {0, 0, 0, 0};
        int expected = -1;
        assertEquals(expected, Basement.basement(input));
    }

    @Test
    public void testBasementWithLateNegativeSum() {
        int[] input = {10, 20, -15, -20};
        int expected = 3;
        assertEquals(expected, Basement.basement(input));
    }
}