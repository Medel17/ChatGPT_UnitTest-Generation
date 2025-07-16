import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_NumberDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzz_NumberDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzz_NumberDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void testFizzBuzz_NumberNotDivisibleByThreeOrFive() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
    }

    @Test
    public void testFizzBuzz_Zero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void testFizzBuzz_NegativeNumbers() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-15));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(-3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(-5));
        assertEquals("-1", FizzBuzz.fizzBuzz(-1));
    }
}