import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GCDTest {

    @Test
    public void testGcdBothPositive() {
        assertEquals(6, GCD.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    public void testGcdBothNegative() {
        assertEquals(6, GCD.gcd(-54, -24), "GCD of -54 and -24 should be 6");
    }

    @Test
    public void testGcdOneNegativeOnePositive() {
        assertEquals(6, GCD.gcd(-54, 24), "GCD of -54 and 24 should be 6");
        assertEquals(6, GCD.gcd(54, -24), "GCD of 54 and -24 should be 6");
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(54, GCD.gcd(54, 0), "GCD of 54 and 0 should be 54");
        assertEquals(24, GCD.gcd(0, 24), "GCD of 0 and 24 should be 24");
    }

    @Test
    public void testGcdZeroZero() {
        assertEquals(0, GCD.gcd(0, 0), "GCD of 0 and 0 should be 0");
    }

    @Test
    public void testGcdSameNumbers() {
        assertEquals(54, GCD.gcd(54, 54), "GCD of 54 and 54 should be 54");
    }

    @Test
    public void testGcdPrimeNumbers() {
        assertEquals(1, GCD.gcd(17, 13), "GCD of 17 and 13 should be 1");
    }

    @Test
    public void testGcdOneIsMultipleOfAnother() {
        assertEquals(5, GCD.gcd(5, 20), "GCD of 5 and 20 should be 5");
        assertEquals(7, GCD.gcd(49, 7), "GCD of 49 and 7 should be 7");
    }
}