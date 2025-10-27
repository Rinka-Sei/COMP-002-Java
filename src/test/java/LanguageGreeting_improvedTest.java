package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageGreeting_improvedTest {

    private final LanguageGreeting_improved greeter = new LanguageGreeting_improved();

    @Test
    public void testGetGreeting_English() {
        assertEquals("Hello", greeter.getGreeting("english"));
    }

    @Test
    public void testGetGreeting_Spanish() {
        assertEquals("Hola", greeter.getGreeting("spanish"));
    }

    @Test
    public void testGetGreeting_Uppercase() {
        assertEquals("Hello", greeter.getGreeting("ENGLISH"));
    }

    @Test
    public void testGetGreeting_Invalid() {
        assertEquals("Language not recognized. Cannot provide a custom greeting.", greeter.getGreeting("german"));
    }
}
