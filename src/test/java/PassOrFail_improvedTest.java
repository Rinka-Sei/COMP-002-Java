package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassOrFail_improvedTest {

    private final PassOrFail_improved checker = new PassOrFail_improved();

    @Test
    public void testCheckPassOrFail_Pass() {
        assertEquals("**Pass**", checker.checkPassOrFail(80.0));
    }

    @Test
    public void testCheckPassOrFail_Fail() {
        assertEquals("**Fail**", checker.checkPassOrFail(70.0));
    }

    @Test
    public void testCheckPassOrFail_Boundary() {
        assertEquals("**Pass**", checker.checkPassOrFail(75.0));
    }
}
