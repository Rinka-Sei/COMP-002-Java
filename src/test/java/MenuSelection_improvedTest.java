package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuSelection_improvedTest {

    private final MenuSelection_improved menu = new MenuSelection_improved();

    @Test
    public void testGetMenuSelection_Burger() {
        assertEquals("Burger", menu.getMenuSelection(1));
    }

    @Test
    public void testGetMenuSelection_Exit() {
        assertEquals("Exit - Thank you!", menu.getMenuSelection(4));
    }

    @Test
    public void testGetMenuSelection_Invalid() {
        assertEquals("Invalid choice. Please select 1, 2, 3, or 4.", menu.getMenuSelection(5));
    }
}
