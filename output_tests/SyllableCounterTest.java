import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SyllableCounterTest {

    @Test
    public void testWithVowels() {
        assertEquals("The number of syllables is 5", SyllableCounter.syllables("education"));
    }

    @Test
    public void testWithNoVowels() {
        assertEquals("The number of syllables is 0", SyllableCounter.syllables("rhythm"));
    }

    @Test
    public void testWithEmptyString() {
        assertEquals("The number of syllables is 0", SyllableCounter.syllables(""));
    }

    @Test
    public void testWithConsecutiveVowels() {
        assertEquals("The number of syllables is 3", SyllableCounter.syllables("beautiful"));
    }

    @Test
    public void testWithUpperCaseVowels() {
        assertEquals("The number of syllables is 5", SyllableCounter.syllables("AEIOUY"));
    }

    @Test
    public void testWithMixedCaseVowels() {
        assertEquals("The number of syllables is 5", SyllableCounter.syllables("aEiOuY"));
    }

    @Test
    public void testWithPunctuation() {
        assertEquals("The number of syllables is 3", SyllableCounter.syllables("hello, world!"));
    }

    @Test
    public void testWithNumbers() {
        assertEquals("The number of syllables is 1", SyllableCounter.syllables("hello2u"));
    }

    @Test
    public void testWithSpaces() {
        assertEquals("The number of syllables is 6", SyllableCounter.syllables("I am testing spaces"));
    }
}