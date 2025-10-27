package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSignChecker_improvedTest {

    private final NumberSignChecker_improved checker = new NumberSignChecker_improved();

    @Test
    public void testCheckSign_Positive() {
        assertEquals("**Positive**", checker.checkSign(10.0));
    }

    @Test
    public void testCheckSign_Negative() {
        assertEquals("**Negative**", checker.checkSign(-5.0));
    }

    @Test
    public void testCheckSign_Zero() {
        assertEquals("**Zero**", checker.checkSign(0.0));
    }
}
