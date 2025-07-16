import java.util.Arrays;

public class Sort {
    static void swap(int a[], int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static int[] sort(int[] a) {
        int result[] = Arrays.copyOf(a, a.length);
        for (int i = 0; i < result.length; i++) {
            for (int y = 0; y < result.length - i - 1; y++) {
                if (result[y] > result[y + 1]) {
                    swap(result, y, y + 1);
                }
            }
        }
        return result;
    }
} 