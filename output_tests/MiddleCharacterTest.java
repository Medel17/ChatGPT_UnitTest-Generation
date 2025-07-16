import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleCharacterTest {

    @Test
    public void testMiddleCharacterWithOddLengthString() {
        assertEquals("c", MiddleCharacter.middleCharacter("abcde"));
    }

    @Test
    public void testMiddleCharacterWithEvenLengthString() {
        assertEquals("cd", MiddleCharacter.middleCharacter("abcdef"));
    }

    @Test
    public void testMiddleCharacterWithSingleCharacter() {
        assertEquals("a", MiddleCharacter.middleCharacter("a"));
    }

    @Test
    public void testMiddleCharacterWithTwoCharacters() {
        assertEquals("ab", MiddleCharacter.middleCharacter("ab"));
    }

    @Test
    public void testMiddleCharacterWithEmptyString() {
        assertEquals("", MiddleCharacter.middleCharacter(""));
    }

    @Test
    public void testMiddleCharacterWithSpecialCharacters() {
        assertEquals("@#", MiddleCharacter.middleCharacter("abc@#def"));
    }

    @Test
    public void testMiddleCharacterWithSpaces() {
        assertEquals("  ", MiddleCharacter.middleCharacter("abc  def"));
    }

    @Test
    public void testMiddleCharacterWithUnicode() {
        assertEquals("中", MiddleCharacter.middleCharacter("日本中文"));
    }
}