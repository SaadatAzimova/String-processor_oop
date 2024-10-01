import org.example.StringProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {
    @Test
    public void isStrongPasswordTest() {
        StringProcessor password = new StringProcessor();
        assertTrue(password.isStrongPassword("Qwerty12345*"));
        assertFalse(password.isStrongPassword("qwerty12345*"));


    }
    @Test
    public void calculateDigitsTest() {
        StringProcessor sentence = new StringProcessor();
        assertEquals(2, sentence.calculateDigits("fyu2fuyuy3"));
        assertNotEquals(2, sentence.calculateDigits("fyu2fuyuy3"));
    }
}
