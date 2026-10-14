package pt.trainings.maven.scratch;

import static org.junit.Assert.*;
import org.junit.Test;

public class GreetingsTest {
    @Test
    public void testNullNameShouldPrintDefaultName() {
        Greetings objectUnderTest = new Greetings();
        assertEquals("Hello John Doe", objectUnderTest.sayHello(null));
    }
}