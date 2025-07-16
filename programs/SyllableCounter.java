public class SyllableCounter {
    public static String syllables(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
            if ("aeiouy".indexOf(c) != -1) {
                count++;
            }
        }
        return "The number of syllables is " + count;
    }
} 