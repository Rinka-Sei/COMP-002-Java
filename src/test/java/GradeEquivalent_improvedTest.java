package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeEquivalent_improvedTest {

    private final GradeEquivalent_improved gradeEquivalent = new GradeEquivalent_improved();

    @Test
    public void testGetGradeRemarks_A() {
        assertEquals("Excellent", gradeEquivalent.getGradeRemarks('A'));
    }

    @Test
    public void testGetGradeRemarks_F() {
        assertEquals("Failed", gradeEquivalent.getGradeRemarks('F'));
    }

    @Test
    public void testGetGradeRemarks_lowercase() {
        assertEquals("Excellent", gradeEquivalent.getGradeRemarks('a'));
    }

    @Test
    public void testGetGradeRemarks_Invalid() {
        assertEquals("Invalid grade letter.", gradeEquivalent.getGradeRemarks('X'));
    }
}
