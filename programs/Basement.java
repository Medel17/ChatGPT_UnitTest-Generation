public class Basement {
    public static int basement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                return i;
            }
        }
        return -1;
    }
} 