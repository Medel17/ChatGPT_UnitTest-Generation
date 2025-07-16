public class VectorAverageInt {
    public static int vectorAverage_int(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum / arr.length;
    }
} 