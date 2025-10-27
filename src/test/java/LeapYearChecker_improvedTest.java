package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearChecker_improvedTest {

    private final LeapYearChecker_improved checker = new LeapYearChecker_improved();

    @Test
    public void testIsLeapYear_DivisibleBy400() {
        assertTrue(checker.isLeapYear(2000));
    }

    @Test
    public void testIsLeapYear_DivisibleBy100ButNot400() {
        assertFalse(checker.isLeapYear(1900));
    }

    @Test
    public void testIsLeapYear_DivisibleBy4ButNot100() {
        assertTrue(checker.isLeapYear(2024));
    }

    @Test
    public void testIsLeapYear_NotDivisibleBy4() {
        assertFalse(checker.isLeapYear(2023));
    }
}
