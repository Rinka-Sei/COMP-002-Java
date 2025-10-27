package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    public void testMain_CorrectPassword() {
        String input = "admin123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PasswordValidator.main(new String[]{});

        String expectedOutput = "Input password: **Access Granted**" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_IncorrectPassword() {
        String input = "wrongpassword";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PasswordValidator.main(new String[]{});

        String expectedOutput = "Input password: **Access Denied**" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
