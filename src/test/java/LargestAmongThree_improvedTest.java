package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestAmongThree_improvedTest {

    private final LargestAmongThree_improved finder = new LargestAmongThree_improved();

    @Test
    public void testFindLargest_FirstNumberIsLargest() {
        assertEquals(10.0, finder.findLargest(10.0, 5.0, 2.0));
    }

    @Test
    public void testFindLargest_SecondNumberIsLargest() {
        assertEquals(20.0, finder.findLargest(10.0, 20.0, 5.0));
    }

    @Test
    public void testFindLargest_ThirdNumberIsLargest() {
        assertEquals(30.0, finder.findLargest(10.0, 20.0, 30.0));
    }

    @Test
    public void testFindLargest_WithNegativeNumbers() {
        assertEquals(-2.0, finder.findLargest(-5.0, -2.0, -10.0));
    }
}
