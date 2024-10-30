import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EvenCheckerTest {

    private final EvenChecker evenChecker = new EvenChecker();

    @Test
    public void testIsEven() {
        assertTrue("2 should be even", evenChecker.isEven(2));
        assertTrue("0 should be even", evenChecker.isEven(0));
        assertTrue("-4 should be even", evenChecker.isEven(-4));
    }

    @Test
    public void testIsNotEven() {
        assertFalse("3 should not be even", evenChecker.isEven(3));
        assertFalse("-5 should not be even", evenChecker.isEven(-5));
    }
}