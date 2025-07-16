public class IsLeapYear {
    public static boolean isLeapYear(int y) {
        if (y % 4 != 0) {
            return false;
        }
        if (y % 400 == 0) {
            return true;
        }
        return y % 100 != 0;
    }
} 