package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringComparison_improvedTest {

    private final StringComparison_improved comparator = new StringComparison_improved();

    @Test
    public void testAreStringsEqual_EqualStrings() {
        assertTrue(comparator.areStringsEqual("hello", "hello"));
    }

    @Test
    public void testAreStringsEqual_UnequalStrings() {
        assertFalse(comparator.areStringsEqual("hello", "world"));
    }

    @Test
    public void testAreStringsEqual_CaseSensitive() {
        assertFalse(comparator.areStringsEqual("hello", "Hello"));
    }
}
