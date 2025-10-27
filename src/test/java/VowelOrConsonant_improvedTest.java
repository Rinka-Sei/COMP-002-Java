package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelOrConsonant_improvedTest {

    private final VowelOrConsonant_improved checker = new VowelOrConsonant_improved();

    @Test
    public void testCheckVowelOrConsonant_Vowel() {
        assertEquals("**Vowel**", checker.checkVowelOrConsonant('a'));
    }

    @Test
    public void testCheckVowelOrConsonant_Consonant() {
        assertEquals("**Consonant**", checker.checkVowelOrConsonant('b'));
    }

    @Test
    public void testCheckVowelOrConsonant_UppercaseVowel() {
        assertEquals("**Vowel**", checker.checkVowelOrConsonant('E'));
    }

    @Test
    public void testCheckVowelOrConsonant_NotALetter() {
        assertEquals("Input is not a letter.", checker.checkVowelOrConsonant('5'));
    }
}
