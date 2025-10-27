package BSIT1stSem.SwitchStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightActionTest {

    @Test
    public void testMain_Red() {
        String input = "red";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TrafficLightAction.main(new String[]{});

        String expectedOutput = "Input a color (red, yellow, green): Instruction: STOP" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_Invalid() {
        String input = "blue";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TrafficLightAction.main(new String[]{});

        String expectedOutput = "Input a color (red, yellow, green): Instruction: Unknown color. Traffic light colors are Red, Yellow, Green." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
