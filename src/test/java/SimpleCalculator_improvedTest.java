package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

public class SimpleCalculator_improvedTest {

    private final SimpleCalculator_improved calculator = new SimpleCalculator_improved();

    @Test
    public void testCalculate_Addition() {
        Optional<Double> result = calculator.calculate('+', 10.0, 5.0);
        assertTrue(result.isPresent());
        assertEquals(15.0, result.get());
    }

    @Test
    public void testCalculate_Subtraction() {
        Optional<Double> result = calculator.calculate('-', 10.0, 5.0);
        assertTrue(result.isPresent());
        assertEquals(5.0, result.get());
    }

    @Test
    public void testCalculate_Multiplication() {
        Optional<Double> result = calculator.calculate('*', 10.0, 5.0);
        assertTrue(result.isPresent());
        assertEquals(50.0, result.get());
    }

    @Test
    public void testCalculate_Division() {
        Optional<Double> result = calculator.calculate('/', 10.0, 5.0);
        assertTrue(result.isPresent());
        assertEquals(2.0, result.get());
    }

    @Test
    public void testCalculate_DivisionByZero() {
        Optional<Double> result = calculator.calculate('/', 10.0, 0.0);
        assertFalse(result.isPresent());
    }

    @Test
    public void testCalculate_InvalidOperator() {
        Optional<Double> result = calculator.calculate('$', 10.0, 5.0);
        assertFalse(result.isPresent());
    }
}
