package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSignCheckerTest {

    @Test
    public void testMain_Positive() {
        String input = "10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        NumberSignChecker.main(new String[]{});

        String expectedOutput = "Input a number: The number is **Positive**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Negative() {
        String input = "-5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        NumberSignChecker.main(new String[]{});

        String expectedOutput = "Input a number: The number is **Negative**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
