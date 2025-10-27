package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeek_improvedTest {

    private final DayOfWeek_improved dayOfWeek = new DayOfWeek_improved();

    @Test
    public void testGetDayOfWeek_Sunday() {
        assertEquals("Sunday", dayOfWeek.getDayOfWeek(1));
    }

    @Test
    public void testGetDayOfWeek_Monday() {
        assertEquals("Monday", dayOfWeek.getDayOfWeek(2));
    }

    @Test
    public void testGetDayOfWeek_Saturday() {
        assertEquals("Saturday", dayOfWeek.getDayOfWeek(7));
    }

    @Test
    public void testGetDayOfWeek_Invalid() {
        assertEquals("Invalid number. Please enter a number between 1 and 7.", dayOfWeek.getDayOfWeek(8));
    }
}
