import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChecksumTest {
    @Test
    void testEmptyString() {
        assertEquals("Check sum is  ", Checksum.checksum(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("Check sum is A", Checksum.checksum("A"));
    }

    @Test
    void testMultipleCharacters() {
        assertEquals("Check sum is @", Checksum.checksum("Hello"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals("Check sum is  ", Checksum.checksum("!@#$"));
    }

    @Test
    void testLongString() {
        assertEquals("Check sum is 8", Checksum.checksum("This is a very long string for testing purposes"));
    }
} 