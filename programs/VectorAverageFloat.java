public class VectorAverageFloat {
    public static float vectorAverage_float(float[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        float sum = 0;
        for (float element : arr) {
            sum += element;
        }
        float length = arr.length;
        return sum / length;
    }
} 