package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringComparisonTest {

    @Test
    public void testMain_EqualStrings() {
        String input = "hello\nhello";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringComparison.main(new String[]{});

        String expectedOutput = "Input the first string: " + "Input the second string: " + "The two strings are **equal**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_UnequalStrings() {
        String input = "hello\nworld";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringComparison.main(new String[]{});

        String expectedOutput = "Input the first string: " + "Input the second string: " + "The two strings are **not equal**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
