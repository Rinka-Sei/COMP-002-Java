package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelOrConsonantTest {

    @Test
    public void testMain_Vowel() {
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        VowelOrConsonant.main(new String[]{});

        String expectedOutput = "Input a single character: a is a **Vowel**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Consonant() {
        String input = "b";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        VowelOrConsonant.main(new String[]{});

        String expectedOutput = "Input a single character: b is a **Consonant**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
