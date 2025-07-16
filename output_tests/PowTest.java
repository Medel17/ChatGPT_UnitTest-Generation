import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowTest {

    @Test
    public void testPositivePower() {
        assertEquals(8, Pow.pow(2, 3), "2^3 should be 8");
        assertEquals(1, Pow.pow(5, 0), "5^0 should be 1");
        assertEquals(1024, Pow.pow(2, 10), "2^10 should be 1024");
    }

    @Test
    public void testNegativePower() {
        assertEquals(0, Pow.pow(2, -1), "2^-1 should return 0 as per method definition");
        assertEquals(0, Pow.pow(3, -5), "3^-5 should return 0 as per method definition");
    }

    @Test
    public void testZeroPower() {
        assertEquals(1, Pow.pow(0, 0), "0^0 should return 1 as per method definition");
        assertEquals(0, Pow.pow(0, 5), "0^5 should return 0");
    }

    @Test
    public void testOnePower() {
        assertEquals(1, Pow.pow(1, 1), "1^1 should be 1");
        assertEquals(1, Pow.pow(1, 100), "1^100 should be 1");
    }

    @Test
    public void testZeroBase() {
        assertEquals(0, Pow.pow(0, 1), "0^1 should be 0");
        assertEquals(0, Pow.pow(0, 10), "0^10 should be 0");
    }

    @Test
    public void testNegativeBase() {
        assertEquals(-8, Pow.pow(-2, 3), "-2^3 should be -8");
        assertEquals(16, Pow.pow(-2, 4), "-2^4 should be 16");
    }
}