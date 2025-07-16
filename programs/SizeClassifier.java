public class SizeClassifier {
    public static String smallOrLarge(int n) {
        if (n < 1000) {
            return "small";
        }
        if (n >= 2000) {
            return "large";
        }
        return "";
    }
} 