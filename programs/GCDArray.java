public class GCDArray {
    private static int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcd_array(int[] arr) {
        int result = 0;
        for (int element : arr) {
            result = gcd(result, element);
        }
        return result;
    }
} 