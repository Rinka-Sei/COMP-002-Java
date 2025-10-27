package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMonthAbbreviationTest {

    @Test
    public void testMain_Jan() {
        String input = "Jan";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringMonthAbbreviation.main(new String[]{});

        String expectedOutput = "Input a month abbreviation (e.g., 'Jan', 'Feb'): Full month name: January" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "xyz";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringMonthAbbreviation.main(new String[]{});

        String expectedOutput = "Input a month abbreviation (e.g., 'Jan', 'Feb'): Full month name: Invalid month abbreviation." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
