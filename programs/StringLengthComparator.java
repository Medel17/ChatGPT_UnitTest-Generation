public class StringLengthComparator {
    public static boolean compareStringLengths(String str1, String str2, String str3) {
        if (str1.length() >= str2.length()) {
            return false;
        }
        if (str2.length() >= str3.length()) {
            return false;
        }
        return true;
    }
} 