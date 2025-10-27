package BSIT1stSem.IfStatements;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestAmongThreeTest {

    @Test
    public void testMain_FirstIsLargest() {
        String input = "10\n5\n2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LargestAmongThree.main(new String[]{});

        String expectedOutput = "Input the first number: " + "Input the second number: " + "Input the third number: " + "The largest number is: 10.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMain_ThirdIsLargest() {
        String input = "5\n10\n15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LargestAmongThree.main(new String[]{});

        String expectedOutput = "Input the first number: " + "Input the second number: " + "Input the third number: " + "The largest number is: 15.0" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
