import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedianFinderTest {

    @Test
    public void testMedianOfThree_AllEqual() {
        assertEquals(5, MedianFinder.medianOfThree(5, 5, 5));
    }

    @Test
    public void testMedianOfThree_FirstMiddle() {
        assertEquals(2, MedianFinder.medianOfThree(2, 3, 1));
    }

    @Test
    public void testMedianOfThree_SecondMiddle() {
        assertEquals(2, MedianFinder.medianOfThree(1, 2, 3));
    }

    @Test
    public void testMedianOfThree_ThirdMiddle() {
        assertEquals(2, MedianFinder.medianOfThree(3, 1, 2));
    }

    @Test
    public void testMedianOfThree_NegativeNumbers() {
        assertEquals(-2, MedianFinder.medianOfThree(-1, -2, -3));
    }

    @Test
    public void testMedianOfThree_MixedSigns() {
        assertEquals(1, MedianFinder.medianOfThree(-1, 1, 3));
    }

    @Test
    public void testMedianOfThree_LargeNumbers() {
        assertEquals(1000000, MedianFinder.medianOfThree(1000000, 2000000, 500000));
    }

    @Test
    public void testMedianOfThree_SmallAndLarge() {
        assertEquals(0, MedianFinder.medianOfThree(-1000000, 0, 1000000));
    }
}