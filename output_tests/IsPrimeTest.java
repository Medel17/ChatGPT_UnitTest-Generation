import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsPrimeTest {

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-1), "Negative numbers should not be prime.");
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0), "0 should not be prime.");
    }

    @Test
    public void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1), "1 should not be prime.");
    }

    @Test
    public void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2), "2 should be prime.");
    }

    @Test
    public void testIsPrimeWithThree() {
        assertTrue(IsPrime.isPrime(3), "3 should be prime.");
    }

    @Test
    public void testIsPrimeWithFour() {
        assertFalse(IsPrime.isPrime(4), "4 should not be prime as it is divisible by 2.");
    }

    @Test
    public void testIsPrimeWithFive() {
        assertTrue(IsPrime.isPrime(5), "5 should be prime.");
    }

    @Test
    public void testIsPrimeWithSix() {
        assertFalse(IsPrime.isPrime(6), "6 should not be prime as it is divisible by 2 and 3.");
    }

    @Test
    public void testIsPrimeWithLargePrime() {
        assertTrue(IsPrime.isPrime(29), "29 is a prime number.");
    }

    @Test
    public void testIsPrimeWithLargeNonPrime() {
        assertFalse(IsPrime.isPrime(35), "35 should not be prime as it is divisible by 5 and 7.");
    }

    @Test
    public void testIsPrimeWithVeryLargePrime() {
        assertTrue(IsPrime.isPrime(7919), "7919 is a prime number.");
    }

    @Test
    public void testIsPrimeWithVeryLargeNonPrime() {
        assertFalse(IsPrime.isPrime(7920), "7920 should not be prime as it is divisible by many numbers.");
    }
}