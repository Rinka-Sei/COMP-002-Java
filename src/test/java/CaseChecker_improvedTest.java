package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseChecker_improvedTest {

    private final CaseChecker_improved caseChecker = new CaseChecker_improved();

    @Test
    public void testCheckCase_Uppercase() {
        assertEquals("A is an **Uppercase Letter**.", caseChecker.checkCase('A'));
    }

    @Test
    public void testCheckCase_Lowercase() {
        assertEquals("a is a **Lowercase Letter**.", caseChecker.checkCase('a'));
    }

    @Test
    public void testCheckCase_NotALetter() {
        assertEquals("5 is not an alphabet.", caseChecker.checkCase('5'));
    }
}
