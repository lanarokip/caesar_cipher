import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void Caesar_inputTwo_string() {
        Caesar caesar = new  Caesar ("message", 8);
        assertEquals("message", caesar.getText());
    }
    @Test
    public void Caesar_takesShiftKey_int(){
        Caesar caesar = new Caesar ("message", 8);
        assertEquals(8, caesar.getShiftKey());
    }

    @Test
    public void Caesar_textToUppercase_upperCase() {
        Caesar caesar = new Caesar("message",7);
        assertEquals("MESSAGE",caesar.getText());
    }
}
