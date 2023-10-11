import org.junit.Test;
import static org.junit.Assert.*;

public class TestNumberInInterval {
    @Test
    public void testNumberMoreThan100() {
        assertFalse(NumberInInterval.numberInInterval(101));
    }

    @Test
    public void testNumberLessThan25() {
        assertFalse(NumberInInterval.numberInInterval(24));
    }

    @Test
    public void testNumberIs25() {
        assertFalse(NumberInInterval.numberInInterval(25));
    }

    @Test
    public void testNumberIs100() {
        assertFalse(NumberInInterval.numberInInterval(100));
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(NumberInInterval.numberInInterval(56));
    }
}