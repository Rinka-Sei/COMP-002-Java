package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordValidator_improvedTest {

    private final PasswordValidator_improved validator = new PasswordValidator_improved();

    @Test
    public void testIsPasswordCorrect_CorrectPassword() {
        assertTrue(validator.isPasswordCorrect("admin123"));
    }

    @Test
    public void testIsPasswordCorrect_IncorrectPassword() {
        assertFalse(validator.isPasswordCorrect("wrongpassword"));
    }

    @Test
    public void testIsPasswordCorrect_EmptyPassword() {
        assertFalse(validator.isPasswordCorrect(""));
    }
}
