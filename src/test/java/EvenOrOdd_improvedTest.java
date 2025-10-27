package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOdd_improvedTest {

    private final EvenOrOdd_improved checker = new EvenOrOdd_improved();

    @Test
    public void testCheckEvenOrOdd_Even() {
        assertEquals("**Even**", checker.checkEvenOrOdd(4));
    }

    @Test
    public void testCheckEvenOrOdd_Odd() {
        assertEquals("**Odd**", checker.checkEvenOrOdd(5));
    }

    @Test
    public void testCheckEvenOrOdd_Zero() {
        assertEquals("**Even**", checker.checkEvenOrOdd(0));
    }
}
