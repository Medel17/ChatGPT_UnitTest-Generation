public class MedianFinder {
    public static int medianOfThree(int a, int b, int c) {
        if (a < b) {
            if (b < c) {
                return b;
            }
            return c;
        } else {
            if (a < c) {
                return a;
            }
            return c;
        }
    }
} 