public class PairedDigits {
    public static int pairedDigits(String input) {
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                sum += input.charAt(i) - '0';
            }
        }
        return sum;
    }
} 