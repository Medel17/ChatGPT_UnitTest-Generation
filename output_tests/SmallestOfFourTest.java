import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestOfFourTest {

    @Test
    public void testAllEqual() {
        assertEquals(4, SmallestOfFour.smallestOfFour(4, 4, 4, 4));
    }

    @Test
    public void testFirstIsSmallest() {
        assertEquals(1, SmallestOfFour.smallestOfFour(1, 2, 3, 4));
    }

    @Test
    public void testSecondIsSmallest() {
        assertEquals(1, SmallestOfFour.smallestOfFour(2, 1, 3, 4));
    }

    @Test
    public void testThirdIsSmallest() {
        assertEquals(1, SmallestOfFour.smallestOfFour(2, 3, 1, 4));
    }

    @Test
    public void testFourthIsSmallest() {
        assertEquals(1, SmallestOfFour.smallestOfFour(2, 3, 4, 1));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-4, SmallestOfFour.smallestOfFour(-1, -2, -3, -4));
    }

    @Test
    public void testMixedNumbers() {
        assertEquals(-10, SmallestOfFour.smallestOfFour(-10, 20, 30, 0));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(1000000, SmallestOfFour.smallestOfFour(1000000, 2000000, 3000000, 4000000));
    }

    @Test
    public void testZerosAndNegatives() {
        assertEquals(-2, SmallestOfFour.smallestOfFour(0, -1, -2, 1));
    }

    @Test
    public void testAllZeros() {
        assertEquals(0, SmallestOfFour.smallestOfFour(0, 0, 0, 0));
    }
}