public class MirrorImage {
    public static boolean mirrorImage(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            int oppositeIndex = arr2.length - i - 1;
            if (arr1[i] != arr2[oppositeIndex]) {
                return false;
            }
        }
        return true;
    }
} 