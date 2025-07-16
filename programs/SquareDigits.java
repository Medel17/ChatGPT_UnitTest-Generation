public class SquareDigits {
    public static String squareDigits(int x) {
        String result = "";
        while (x > 0) {
            int digit = x % 10;
            int square = digit * digit;
            result = square + result;
            x /= 10;
        }
        return result;
    }
} 