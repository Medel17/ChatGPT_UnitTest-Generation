public class MiddleCharacter {
    public static String middleCharacter(String string) {
        if (string.isEmpty()) {
            return "";
        }
        if (string.length() % 2 == 0) {
            return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
        }
        return Character.toString(string.charAt(string.length() / 2));
    }
} 