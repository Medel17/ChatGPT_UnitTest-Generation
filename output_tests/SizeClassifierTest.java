import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SizeClassifierTest {

    @Test
    public void testSmallOrLarge_Small() {
        assertEquals("small", SizeClassifier.smallOrLarge(999));
        assertEquals("small", SizeClassifier.smallOrLarge(0));
        assertEquals("small", SizeClassifier.smallOrLarge(-1));
        assertEquals("small", SizeClassifier.smallOrLarge(Integer.MIN_VALUE));
    }

    @Test
    public void testSmallOrLarge_Large() {
        assertEquals("large", SizeClassifier.smallOrLarge(2000));
        assertEquals("large", SizeClassifier.smallOrLarge(5000));
        assertEquals("large", SizeClassifier.smallOrLarge(Integer.MAX_VALUE));
    }

    @Test
    public void testSmallOrLarge_Empty() {
        assertEquals("", SizeClassifier.smallOrLarge(1000));
        assertEquals("", SizeClassifier.smallOrLarge(1500));
        assertEquals("", SizeClassifier.smallOrLarge(1999));
    }
}