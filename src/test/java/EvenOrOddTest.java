package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testMain_Even() {
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        EvenOrOdd.main(new String[]{});

        String expectedOutput = "Input an integer: 4 is an **Even** number." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Odd() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        EvenOrOdd.main(new String[]{});

        String expectedOutput = "Input an integer: 5 is an **Odd** number." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
