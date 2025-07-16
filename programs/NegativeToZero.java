public class NegativeToZero {
    public static int[] negativeToZero(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            int elem = arr[i];
            final int res;
            if (elem > 0) {
                res = elem;
            } else {
                res = 0;
            }
            result[i] = res;
        }
        return result;
    }
} 