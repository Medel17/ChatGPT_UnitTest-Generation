import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLengthComparatorTest {

    @Test
    void testCompareStringLengths_AllDifferentLengthsIncreasingOrder() {
        assertTrue(StringLengthComparator.compareStringLengths("a", "ab", "abc"));
    }

    @Test
    void testCompareStringLengths_AllDifferentLengthsDecreasingOrder() {
        assertFalse(StringLengthComparator.compareStringLengths("abc", "ab", "a"));
    }

    @Test
    void testCompareStringLengths_FirstTwoSameLength() {
        assertFalse(StringLengthComparator.compareStringLengths("ab", "ab", "abc"));
    }

    @Test
    void testCompareStringLengths_LastTwoSameLength() {
        assertFalse(StringLengthComparator.compareStringLengths("a", "ab", "ab"));
    }

    @Test
    void testCompareStringLengths_AllSameLength() {
        assertFalse(StringLengthComparator.compareStringLengths("ab", "ab", "ab"));
    }

    @Test
    void testCompareStringLengths_EmptyStrings() {
        assertTrue(StringLengthComparator.compareStringLengths("", "a", "ab"));
    }

    @Test
    void testCompareStringLengths_FirstStringEmpty() {
        assertFalse(StringLengthComparator.compareStringLengths("", "", "a"));
    }

    @Test
    void testCompareStringLengths_SecondStringEmpty() {
        assertFalse(StringLengthComparator.compareStringLengths("a", "", ""));
    }

    @Test
    void testCompareStringLengths_ThirdStringEmpty() {
        assertFalse(StringLengthComparator.compareStringLengths("a", "ab", ""));
    }

    @Test
    void testCompareStringLengths_NullInput() {
        assertThrows(NullPointerException.class, () -> StringLengthComparator.compareStringLengths(null, "ab", "abc"));
        assertThrows(NullPointerException.class, () -> StringLengthComparator.compareStringLengths("ab", null, "abc"));
        assertThrows(NullPointerException.class, () -> StringLengthComparator.compareStringLengths("ab", "abc", null));
    }
}