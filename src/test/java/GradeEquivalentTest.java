package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeEquivalentTest {

    @Test
    public void testMain_Excellent() {
        String input = "A";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GradeEquivalent.main(new String[]{});

        String expectedOutput = "Input a grade letter (A, B, C, D, F): Remarks: Excellent" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "X";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        GradeEquivalent.main(new String[]{});

        String expectedOutput = "Input a grade letter (A, B, C, D, F): Remarks: Invalid grade letter." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
