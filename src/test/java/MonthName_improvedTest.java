package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonthName_improvedTest {

    private final MonthName_improved monthName = new MonthName_improved();

    @Test
    public void testGetMonthName_January() {
        assertEquals("January", monthName.getMonthName(1));
    }

    @Test
    public void testGetMonthName_December() {
        assertEquals("December", monthName.getMonthName(12));
    }

    @Test
    public void testGetMonthName_Invalid() {
        assertEquals("Invalid month number.", monthName.getMonthName(13));
    }
}
