import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterDoublerTest {

    @Test
    public void testDoubleLetters_AllLowerCase() {
        assertEquals("aabbcc", LetterDoubler.doubleLetters("abc"));
    }

    @Test
    public void testDoubleLetters_AllUpperCase() {
        assertEquals("AABBCC", LetterDoubler.doubleLetters("ABC"));
    }

    @Test
    public void testDoubleLetters_MixedCase() {
        assertEquals("AAbbcc", LetterDoubler.doubleLetters("Abc"));
    }

    @Test
    public void testDoubleLetters_Numbers() {
        assertEquals("123", LetterDoubler.doubleLetters("123"));
    }

    @Test
    public void testDoubleLetters_SpecialCharacters() {
        assertEquals("!!!---", LetterDoubler.doubleLetters("!--"));
    }

    @Test
    public void testDoubleLetters_EmptyString() {
        assertEquals("", LetterDoubler.doubleLetters(""));
    }

    @Test
    public void testDoubleLetters_NullInput() {
        assertEquals(null, LetterDoubler.doubleLetters(null));
    }

    @Test
    public void testDoubleLetters_OnlyExclamationMarks() {
        assertEquals("!!!", LetterDoubler.doubleLetters("!"));
    }

    @Test
    public void testDoubleLetters_MixedContent() {
        assertEquals("AA!!bb33", LetterDoubler.doubleLetters("A!b3"));
    }
}