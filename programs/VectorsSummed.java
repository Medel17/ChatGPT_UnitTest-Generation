public class VectorsSummed {
    public static int[] vectorsSummed(int[] arr1, int[] arr2) {
        int minLength = Math.min(arr1.length, arr2.length);
        int[] sum = new int[minLength];
        for (int i = 0; i < sum.length; i++) {
            int elemSum = arr1[i] + arr2[i];
            sum[i] = elemSum;
        }
        return sum;
    }
} 