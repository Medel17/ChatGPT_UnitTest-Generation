import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsLeapYearTest {

    @Test
    public void testLeapYearDivisibleByFour() {
        assertTrue(IsLeapYear.isLeapYear(2024));
    }

    @Test
    public void testNonLeapYearNotDivisibleByFour() {
        assertFalse(IsLeapYear.isLeapYear(2023));
    }

    @Test
    public void testLeapYearDivisibleByFourHundred() {
        assertTrue(IsLeapYear.isLeapYear(2000));
    }

    @Test
    public void testNonLeapYearDivisibleByOneHundred() {
        assertFalse(IsLeapYear.isLeapYear(1900));
    }

    @Test
    public void testNegativeYearLeap() {
        assertTrue(IsLeapYear.isLeapYear(-400));
    }

    @Test
    public void testNegativeYearNonLeap() {
        assertFalse(IsLeapYear.isLeapYear(-100));
    }

    @Test
    public void testYearZero() {
        assertTrue(IsLeapYear.isLeapYear(0));
    }

    @Test
    public void testTypicalNonLeapYear() {
        assertFalse(IsLeapYear.isLeapYear(2019));
    }

    @Test
    public void testTypicalLeapYear() {
        assertTrue(IsLeapYear.isLeapYear(2016));
    }
}