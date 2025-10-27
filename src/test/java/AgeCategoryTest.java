package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCategoryTest {

    @Test
    public void testMain_Child() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AgeCategory.main(new String[]{});

        String expectedOutput = "Input age: Age Category: **Child** (<13)" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Teen() {
        String input = "15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AgeCategory.main(new String[]{});

        String expectedOutput = "Input age: Age Category: **Teen** (13–19)" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
