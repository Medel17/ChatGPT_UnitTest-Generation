import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VectorsSummedTest {

    @Test
    public void testVectorsSummed_BothArraysSameLength() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {5, 7, 9};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_FirstArrayLonger() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6};
        int[] expected = {5, 7, 9};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_SecondArrayLonger() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] expected = {5, 7, 9};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_EmptyFirstArray() {
        int[] arr1 = {};
        int[] arr2 = {4, 5, 6};
        int[] expected = {};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_EmptySecondArray() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_BothArraysEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_BothArraysContainNegatives() {
        int[] arr1 = {-1, -2, -3};
        int[] arr2 = {-4, -5, -6};
        int[] expected = {-5, -7, -9};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }

    @Test
    public void testVectorsSummed_MixedPositiveNegative() {
        int[] arr1 = {1, -2, 3};
        int[] arr2 = {-4, 5, -6};
        int[] expected = {-3, 3, -3};
        assertArrayEquals(expected, VectorsSummed.vectorsSummed(arr1, arr2));
    }
}