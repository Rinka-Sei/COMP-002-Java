package BSIT1stSem.SwitchStatements_improved;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightAction_improvedTest {

    private final TrafficLightAction_improved trafficLight = new TrafficLightAction_improved();

    @Test
    public void testGetAction_Red() {
        assertEquals("STOP", trafficLight.getAction("red"));
    }

    @Test
    public void testGetAction_Yellow() {
        assertEquals("PREPARE TO STOP / CAUTION", trafficLight.getAction("yellow"));
    }

    @Test
    public void testGetAction_Green() {
        assertEquals("GO", trafficLight.getAction("green"));
    }

    @Test
    public void testGetAction_Uppercase() {
        assertEquals("STOP", trafficLight.getAction("RED"));
    }

    @Test
    public void testGetAction_Invalid() {
        assertEquals("Unknown color. Traffic light colors are Red, Yellow, Green.", trafficLight.getAction("blue"));
    }
}
