import org.example.StringProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {
    @Test
    public void isStrongPasswordTest() {
        StringProcessor password = new StringProcessor();
        assertTrue(password.isStrongPassword("Qwerty12345*"));//true password
        assertTrue(password.isStrongPassword("OopCourse2024!"));//true password
        assertFalse(password.isStrongPassword("qwerty12345*"));//false,password without Upper case letter
        assertFalse(password.isStrongPassword("oopCourse"));//false,password without digits
        assertFalse(password.isStrongPassword(""));//false,password without characters
    }
    @Test
    public void calculateDigitsTest() {
        StringProcessor sentence = new StringProcessor();
        assertEquals(2, sentence.calculateDigits("oop1semester1"));//Equal, with digit
        assertEquals(0, sentence.calculateDigits("oop"));//equal, without any digit
        assertNotEquals(0,sentence.calculateDigits("oop1semester1"));//not equal, with digit
        assertNotEquals(3, sentence.calculateDigits("oop"));//not equal,without  any digit
        assertNotEquals(1,"");//not equal, witout any charaacter
    }
    @Test
    public void calculateWordsTest() {
        StringProcessor sentence = new StringProcessor();
        assertEquals(1, sentence.calculateWords("oop"));//equal, 1 word(1 word)
        assertEquals(2, sentence.calculateWords("oop course"));//equal,2 words(with white space)
        assertEquals(0, sentence.calculateWords(""));//equal, testing null case
        assertNotEquals(3, sentence.calculateWords("oop course"));//not equal
        assertNotEquals(2, sentence.calculateWords(""));//not equal, null case
    }

}
