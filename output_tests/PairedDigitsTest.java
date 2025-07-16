import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PairedDigitsTest {

    @Test
    public void testPairedDigitsWithConsecutivePairs() {
        assertEquals(3, PairedDigits.pairedDigits("1123"));
    }

    @Test
    public void testPairedDigitsWithNoPairs() {
        assertEquals(0, PairedDigits.pairedDigits("1234"));
    }

    @Test
    public void testPairedDigitsWithAllSameDigits() {
        assertEquals(15, PairedDigits.pairedDigits("5555"));
    }

    @Test
    public void testPairedDigitsWithMultiplePairs() {
        assertEquals(11, PairedDigits.pairedDigits("112233"));
    }

    @Test
    public void testPairedDigitsWithEmptyString() {
        assertEquals(0, PairedDigits.pairedDigits(""));
    }

    @Test
    public void testPairedDigitsWithSingleCharacter() {
        assertEquals(0, PairedDigits.pairedDigits("1"));
    }

    @Test
    public void testPairedDigitsWithNonConsecutivePairs() {
        assertEquals(1, PairedDigits.pairedDigits("1211"));
    }

    @Test
    public void testPairedDigitsWithSpecialCharacters() {
        assertEquals(0, PairedDigits.pairedDigits("11a1"));
    }

    @Test
    public void testPairedDigitsWithLeadingAndTrailingPairs() {
        assertEquals(4, PairedDigits.pairedDigits("22112"));
    }
}