public class IsPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n < 4) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n < 9) {
            return true;
        }
        if (n % 3 == 0) {
            return false;
        }
        int r = (int)Math.sqrt(n);
        int f = 5;
        while (f <= r) {
            if (n % f == 0) {
                return false;
            }
            if (n % (f + 2) == 0) {
                return false;
            }
            f = f + 6;
        }
        return true;
    }
} 