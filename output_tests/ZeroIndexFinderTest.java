import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZeroIndexFinderTest {

    @Test
    public void testLastIndexOfZero_WithMultipleZeros() {
        int[] arr = {1, 0, 3, 0, 5};
        assertEquals(3, ZeroIndexFinder.lastIndexOfZero(arr), "The last index of zero should be 3.");
    }

    @Test
    public void testLastIndexOfZero_WithSingleZero() {
        int[] arr = {1, 2, 3, 0, 5};
        assertEquals(3, ZeroIndexFinder.lastIndexOfZero(arr), "The last index of zero should be 3.");
    }

    @Test
    public void testLastIndexOfZero_WithNoZero() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, ZeroIndexFinder.lastIndexOfZero(arr), "There are no zeros, should return -1.");
    }

    @Test
    public void testLastIndexOfZero_WithAllZeros() {
        int[] arr = {0, 0, 0, 0, 0};
        assertEquals(4, ZeroIndexFinder.lastIndexOfZero(arr), "The last index of zero should be 4.");
    }

    @Test
    public void testLastIndexOfZero_WithZeroAtStart() {
        int[] arr = {0, 1, 2, 3, 4};
        assertEquals(0, ZeroIndexFinder.lastIndexOfZero(arr), "The last index of zero should be 0.");
    }

    @Test
    public void testLastIndexOfZero_WithZeroAtEnd() {
        int[] arr = {1, 2, 3, 4, 0};
        assertEquals(4, ZeroIndexFinder.lastIndexOfZero(arr), "The last index of zero should be 4.");
    }

    @Test
    public void testLastIndexOfZero_EmptyArray() {
        int[] arr = {};
        assertEquals(-1, ZeroIndexFinder.lastIndexOfZero(arr), "Empty array should return -1.");
    }
}