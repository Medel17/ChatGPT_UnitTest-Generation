public class ArrayCountComplex {
    public static int arrayCountComplex(int[] a) {
        int count1 = 0;
        for (int element : a) {
            if (element < 0) {
                count1++;
            }
        }
        int count2 = 0;
        for (int element : a) {
            if (element > 0) {
                count2++;
            }
        }
        if (count1 > count2) {
            return count1 - count2;
        }
        return count2 - count1;
    }
} 