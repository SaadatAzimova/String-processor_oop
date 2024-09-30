import org.example.StringProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {
    @Test
    public void isStrongPasswordTest() {
        StringProcessor password = new StringProcessor();
        assertTrue(password.isStrongPassword("Qwerty12345*"));
    }
}
