package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticMenuTest {

    private String getExpectedOutput(String result) {
        return String.join(System.lineSeparator(),
                "",
                "--- Arithmetic Menu ---",
                "1. Add",
                "2. Subtract",
                "3. Multiply",
                "4. Divide") + System.lineSeparator() +
                "Input your option (1-4): " +
                "Input the first number: " +
                "Input the second number: " +
                result + System.lineSeparator();
    }

    @Test
    public void testMain_Addition() {
        String input = "1\n10\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArithmeticMenu.main(new String[]{});

        String expectedOutput = getExpectedOutput("Result of Addition: 15.0");
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

        String expectedOutput = getExpectedOutput("Error: Division by zero is not allowed.");
        assertEquals(expectedOutput, outContent.toString());
    }
}
