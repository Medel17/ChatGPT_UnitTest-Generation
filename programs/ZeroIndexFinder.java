public class ZeroIndexFinder {
    public static int lastIndexOfZero(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index = i;
            }
        }
        return index;
    }
} 