public class SmallestOfFour {
    public static int smallestOfFour(int a, int b, int c, int d) {
        if (a < b) {
            if (c < d) {
                if (a < c) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if (a < d) {
                    return a;
                } else {
                    return d;
                }
            }
        } else {
            if (c < d) {
                if (b < c) {
                    return b;
                } else {
                    return c;
                }
            } else {
                if (b < d) {
                    return b;
                } else {
                    return d;
                }
            }
        }
    }
} 