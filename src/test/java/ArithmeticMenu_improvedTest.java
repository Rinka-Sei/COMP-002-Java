package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArithmeticMenu_improvedTest {

    private final ArithmeticMenu_improved menu = new ArithmeticMenu_improved();

    @Test
    public void testCalculate_Addition() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(1, 10.0, 5.0);
        assertTrue(result.validOperation());
        assertEquals("Addition", result.operation());
        assertEquals(15.0, result.result());
    }

    @Test
    public void testCalculate_Subtraction() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(2, 10.0, 5.0);
        assertTrue(result.validOperation());
        assertEquals("Subtraction", result.operation());
        assertEquals(5.0, result.result());
    }

    @Test
    public void testCalculate_Multiplication() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(3, 10.0, 5.0);
        assertTrue(result.validOperation());
        assertEquals("Multiplication", result.operation());
        assertEquals(50.0, result.result());
    }

    @Test
    public void testCalculate_Division() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(4, 10.0, 5.0);
        assertTrue(result.validOperation());
        assertEquals("Division", result.operation());
        assertEquals(2.0, result.result());
    }

    @Test
    public void testCalculate_DivisionByZero() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(4, 10.0, 0.0);
        assertFalse(result.validOperation());
    }

    @Test
    public void testCalculate_InvalidOption() {
        ArithmeticMenu_improved.CalculationResult result = menu.calculate(5, 10.0, 5.0);
        assertFalse(result.validOperation());
    }
}
