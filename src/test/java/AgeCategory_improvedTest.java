package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCategory_improvedTest {

    private final AgeCategory_improved ageCategory = new AgeCategory_improved();

    @Test
    public void testGetAgeCategory_Child() {
        assertEquals("**Child** (<13)", ageCategory.getAgeCategory(5));
    }

    @Test
    public void testGetAgeCategory_Teen() {
        assertEquals("**Teen** (13–19)", ageCategory.getAgeCategory(15));
    }

    @Test
    public void testGetAgeCategory_Adult() {
        assertEquals("**Adult** (20–59)", ageCategory.getAgeCategory(30));
    }

    @Test
    public void testGetAgeCategory_Senior() {
        assertEquals("**Senior** (60+)", ageCategory.getAgeCategory(70));
    }

    @Test
    public void testGetAgeCategory_Invalid() {
        assertEquals("Invalid Age", ageCategory.getAgeCategory(-5));
    }
}
