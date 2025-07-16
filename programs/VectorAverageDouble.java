public class VectorAverageDouble {
    public static double vectorAverage_double(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        double length = arr.length;
        return sum / length;
    }
} 