package BSIT1stSem.IfStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTypeChecker_improvedTest {

    private final CharacterTypeChecker_improved checker = new CharacterTypeChecker_improved();

    @Test
    public void testGetCharacterType_Alphabet() {
        assertEquals("**Alphabet**", checker.getCharacterType('a'));
    }

    @Test
    public void testGetCharacterType_Number() {
        assertEquals("**Number**", checker.getCharacterType('5'));
    }

    @Test
    public void testGetCharacterType_SpecialCharacter() {
        assertEquals("**Special Character**", checker.getCharacterType('$'));
    }
}
