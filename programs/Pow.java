public class Pow {
    public static int pow(int x, int n) {
        if (n < 0 || x == 0 && n == 0) {
            return 0;
        }
        int k = n;
        int p = x;
        int y = 1;
        while (k > 0) {
            if (k % 2 == 0) {
                p = p * p;
                k = k / 2;
            } else {
                y = y * p;
                k = k - 1;
            }
        }
        return y;
    }
} 