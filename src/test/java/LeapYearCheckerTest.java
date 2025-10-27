package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearCheckerTest {

    @Test
    public void testMain_LeapYear() {
        String input = "2024";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LeapYearChecker.main(new String[]{});

        String expectedOutput = "Input a year: 2024 is a **Leap Year**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_NotLeapYear() {
        String input = "2023";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LeapYearChecker.main(new String[]{});

        String expectedOutput = "Input a year: 2023 is **not a Leap Year**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
