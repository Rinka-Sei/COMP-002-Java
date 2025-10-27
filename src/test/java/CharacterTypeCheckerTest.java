package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTypeCheckerTest {

    @Test
    public void testMain_Alphabet() {
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CharacterTypeChecker.main(new String[]{});

        String expectedOutput = "Input a single character: The character is a(n) **Alphabet**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Number() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CharacterTypeChecker.main(new String[]{});

        String expectedOutput = "Input a single character: The character is a(n) **Number**." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
