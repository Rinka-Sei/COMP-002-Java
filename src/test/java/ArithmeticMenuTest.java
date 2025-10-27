package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticMenuTest {

    @Test
    public void testMain_Addition() {
        String input = "1\n10\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArithmeticMenu.main(new String[]{});

        String expectedOutput = "\n--- Arithmetic Menu ---\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nInput your option (1-4): " + "Input the first number: " + "Input the second number: " + "Result of Addition: 15.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_DivisionByZero() {
        String input = "4\n10\n0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArithmeticMenu.main(new String[]{});

        String expectedOutput = "\n--- Arithmetic Menu ---\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nInput your option (1-4): " + "Input the first number: " + "Input the second number: " + "Error: Division by zero is not allowed." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
