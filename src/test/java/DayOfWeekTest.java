package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {

    @Test
    public void testMain_Sunday() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DayOfWeek.main(new String[]{});

        String expectedOutput = "Input a number (1-7): The corresponding day is: Sunday" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "8";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DayOfWeek.main(new String[]{});

        String expectedOutput = "Input a number (1-7): The corresponding day is: Invalid number. Please enter a number between 1 and 7." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
