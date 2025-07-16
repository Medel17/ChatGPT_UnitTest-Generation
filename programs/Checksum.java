public class Checksum {
    public static String checksum(String input) {
        int checksum = 0;
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
            checksum += c;
        }
        checksum %= 64;
        char checksumChar = (char) checksum;
        checksumChar += ' ';
        return "Check sum is " + checksumChar;
    }
} 