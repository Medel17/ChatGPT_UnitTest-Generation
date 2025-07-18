public class LetterDoubler {
    public static String doubleLetters(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = 1;
            if (c >= 'a' && c <= 'z') {
                count = 2;
            }
            if (c >= 'A' && c <= 'Z') {
                count = 2;
            }
            if (c == '!') {
                count = 3;
            }
            while (count > 0) {
                output += c;
                count--;
            }
        }
        return output;
    }
} 