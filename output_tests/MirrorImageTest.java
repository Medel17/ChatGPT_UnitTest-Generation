import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MirrorImageTest {

    @Test
    public void testMirrorImageWithIdenticalMirroredArrays() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        assertTrue(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithNonIdenticalArrays() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        assertFalse(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithDifferentLengths() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2};
        assertFalse(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithEmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithSingleElementArraysIdentical() {
        int[] arr1 = {1};
        int[] arr2 = {1};
        assertTrue(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithSingleElementArraysDifferent() {
        int[] arr1 = {1};
        int[] arr2 = {2};
        assertFalse(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithAllElementsSame() {
        int[] arr1 = {2, 2, 2, 2};
        int[] arr2 = {2, 2, 2, 2};
        assertFalse(MirrorImage.mirrorImage(arr1, arr2));
    }

    @Test
    public void testMirrorImageWithNegativeNumbers() {
        int[] arr1 = {-1, -2, -3, -4};
        int[] arr2 = {-4, -3, -2, -1};
        assertTrue(MirrorImage.mirrorImage(arr1, arr2));
    }
}