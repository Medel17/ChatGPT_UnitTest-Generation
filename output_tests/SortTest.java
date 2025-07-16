import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {

    @Test
    public void testSort_EmptyArray() {
        int[] emptyArray = {};
        int[] sortedArray = Sort.sort(emptyArray);
        assertArrayEquals(new int[]{}, sortedArray, "Sorting an empty array should return an empty array.");
    }

    @Test
    public void testSort_SingleElement() {
        int[] singleElementArray = {1};
        int[] sortedArray = Sort.sort(singleElementArray);
        assertArrayEquals(new int[]{1}, sortedArray, "Sorting a single-element array should return the same array.");
    }

    @Test
    public void testSort_SortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] resultArray = Sort.sort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, resultArray, "Sorting an already sorted array should return the same sorted array.");
    }

    @Test
    public void testSort_ReverseSortedArray() {
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        int[] sortedArray = Sort.sort(reverseSortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray, "Sorting a reverse sorted array should return a sorted array.");
    }

    @Test
    public void testSort_RandomOrderArray() {
        int[] randomArray = {3, 1, 4, 5, 2};
        int[] sortedArray = Sort.sort(randomArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray, "Sorting a randomly ordered array should return a sorted array.");
    }

    @Test
    public void testSort_ArrayWithDuplicates() {
        int[] arrayWithDuplicates = {3, 1, 4, 1, 5, 2, 3};
        int[] sortedArray = Sort.sort(arrayWithDuplicates);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5}, sortedArray, "Sorting an array with duplicates should return a correctly sorted array.");
    }

    @Test
    public void testSort_NegativeNumbers() {
        int[] arrayWithNegatives = {-3, -1, -4, 0, -2};
        int[] sortedArray = Sort.sort(arrayWithNegatives);
        assertArrayEquals(new int[]{-4, -3, -2, -1, 0}, sortedArray, "Sorting an array with negative numbers should return a correctly sorted array.");
    }

    @Test
    public void testSort_MixedNumbers() {
        int[] mixedArray = {-1, 3, -4, 0, 2};
        int[] sortedArray = Sort.sort(mixedArray);
        assertArrayEquals(new int[]{-4, -1, 0, 2, 3}, sortedArray, "Sorting an array with mixed negative and positive numbers should return a correctly sorted array.");
    }
}