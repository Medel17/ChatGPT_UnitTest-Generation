public class FizzBuzz {
    public static String fizzBuzz(int x) {
        String result = "";
        if (x % 3 == 0) {
            result += "Fizz";
        }
        if (x % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result = Integer.toString(x);
        }
        return result;
    }
} 