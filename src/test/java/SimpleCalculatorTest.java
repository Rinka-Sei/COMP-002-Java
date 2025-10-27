package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testMain_Addition() {
        String input = "10\n+\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SimpleCalculator.main(new String[]{});

        String expectedOutput = "Input first number: " + "Input operator (+, -, *, /): " + "Input second number: " + "10.0 + 5.0 = 15.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_DivisionByZero() {
        String input = "10\n/\n0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SimpleCalculator.main(new String[]{});

        String expectedOutput = "Input first number: " + "Input operator (+, -, *, /): " + "Input second number: " + "Error: Division by zero is not allowed." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
