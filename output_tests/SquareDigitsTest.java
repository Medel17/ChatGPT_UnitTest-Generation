import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareDigitsTest {

    @Test
    public void testSquareDigitsWithSingleDigit() {
        assertEquals("1", SquareDigits.squareDigits(1));
        assertEquals("4", SquareDigits.squareDigits(2));
        assertEquals("9", SquareDigits.squareDigits(3));
    }

    @Test
    public void testSquareDigitsWithMultipleDigits() {
        assertEquals("14916", SquareDigits.squareDigits(1234));
        assertEquals("162481", SquareDigits.squareDigits(1248));
    }

    @Test
    public void testSquareDigitsWithZero() {
        assertEquals("", SquareDigits.squareDigits(0));
    }

    @Test
    public void testSquareDigitsWithLargeNumber() {
        assertEquals("814916", SquareDigits.squareDigits(90234));
    }

    @Test
    public void testSquareDigitsWithLeadingZeros() {
        assertEquals("1", SquareDigits.squareDigits(01));
        assertEquals("100", SquareDigits.squareDigits(010));
    }
}