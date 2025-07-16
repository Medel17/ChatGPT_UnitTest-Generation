import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CollatzTest {

    @Test
    public void testCollatzNumberWithOne() {
        assertEquals(0, Collatz.collatzNumber(1), "The Collatz sequence of 1 should be 0 steps.");
    }

    @Test
    public void testCollatzNumberWithTwo() {
        assertEquals(1, Collatz.collatzNumber(2), "The Collatz sequence of 2 should be 1 step.");
    }

    @Test
    public void testCollatzNumberWithThree() {
        assertEquals(7, Collatz.collatzNumber(3), "The Collatz sequence of 3 should be 7 steps.");
    }

    @Test
    public void testCollatzNumberWithPositiveEvenNumber() {
        assertEquals(9, Collatz.collatzNumber(6), "The Collatz sequence of 6 should be 9 steps.");
    }

    @Test
    public void testCollatzNumberWithPositiveOddNumber() {
        assertEquals(17, Collatz.collatzNumber(7), "The Collatz sequence of 7 should be 17 steps.");
    }

    @Test
    public void testCollatzNumberWithLargeNumber() {
        assertEquals(111, Collatz.collatzNumber(1000), "The Collatz sequence of 1000 should be 111 steps.");
    }

    @Test
    public void testCollatzNumberWithMaximumInt() {
        assertEquals(525, Collatz.collatzNumber(837799), "The Collatz sequence of 837799 should be 525 steps.");
    }
}