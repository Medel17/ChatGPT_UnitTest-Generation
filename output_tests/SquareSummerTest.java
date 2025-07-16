import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareSummerTest {

    @Test
    public void testSumOfSquaresWithPositiveNumber() {
        assertEquals(14, SquareSummer.sumOfSquares(4), "Sum of squares up to 3 should be 14");
        assertEquals(30, SquareSummer.sumOfSquares(5), "Sum of squares up to 4 should be 30");
    }

    @Test
    public void testSumOfSquaresWithOne() {
        assertEquals(0, SquareSummer.sumOfSquares(1), "Sum of squares up to 0 should be 0");
    }

    @Test
    public void testSumOfSquaresWithZero() {
        assertEquals(0, SquareSummer.sumOfSquares(0), "Sum of squares up to -1 should be 0");
    }

    @Test
    public void testSumOfSquaresWithNegativeNumber() {
        assertEquals(0, SquareSummer.sumOfSquares(-1), "Sum of squares for negative input should be 0");
        assertEquals(0, SquareSummer.sumOfSquares(-10), "Sum of squares for negative input should be 0");
    }
}