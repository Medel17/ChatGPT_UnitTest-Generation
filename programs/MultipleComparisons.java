public class MultipleComparisons {
    public static int multipleComparisons(int a1, int a2, int b1, int b2) {
        int greaterA;
        if(a1 > a2) {
            greaterA = a1;
        } else {
            greaterA = a2;
        }
        int smallerB;
        if(b1 < b2) {
            smallerB = b1;
        } else {
            smallerB = b2;
        }
        return greaterA - smallerB;
    }
} 