package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageGreetingTest {

    @Test
    public void testMain_English() {
        String input = "English";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LanguageGreeting.main(new String[]{});

        String expectedOutput = "Input a language (English, Spanish, French, Tagalog): Greeting: Hello" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "German";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LanguageGreeting.main(new String[]{});

        String expectedOutput = "Input a language (English, Spanish, French, Tagalog): Greeting: Language not recognized. Cannot provide a custom greeting." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
