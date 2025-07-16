public class Collatz {
    public static int collatzNumber(int n) {
        int result = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            result++;
        }
        return result;
    }
} 