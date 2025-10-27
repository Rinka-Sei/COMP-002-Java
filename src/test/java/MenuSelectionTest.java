package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuSelectionTest {

    @Test
    public void testMain_Burger() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuSelection.main(new String[]{});

        String expectedOutput = "\n--- Menu ---\n1. Burger\n2. Fries\n3. Drink\n4. Exit\nInput your choice (1–4): You selected: Burger" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MenuSelection.main(new String[]{});

        String expectedOutput = "\n--- Menu ---\n1. Burger\n2. Fries\n3. Drink\n4. Exit\nInput your choice (1–4): You selected: Invalid choice. Please select 1, 2, 3, or 4." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
