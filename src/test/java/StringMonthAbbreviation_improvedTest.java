package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMonthAbbreviation_improvedTest {

    private final StringMonthAbbreviation_improved converter = new StringMonthAbbreviation_improved();

    @Test
    public void testGetFullMonthName_Jan() {
        assertEquals("January", converter.getFullMonthName("Jan"));
    }

    @Test
    public void testGetFullMonthName_Dec() {
        assertEquals("December", converter.getFullMonthName("Dec"));
    }

    @Test
    public void testGetFullMonthName_lowercase() {
        assertEquals("January", converter.getFullMonthName("jan"));
    }

    @Test
    public void testGetFullMonthName_Invalid() {
        assertEquals("Invalid month abbreviation.", converter.getFullMonthName("xyz"));
    }

    @Test
    public void testGetFullMonthName_TooShort() {
        assertEquals("Invalid month abbreviation.", converter.getFullMonthName("Ja"));
    }
}
