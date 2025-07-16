public class OddCounter {
    public static int countOdds(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                count++;
            }
        }
        return count;
    }
} 