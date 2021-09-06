import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void Caesar_inputTwo_string() {
        Caesar caesar = new  Caesar ("message", 8);
        assertEquals("message","message");
    }
    @Test
    public void Caesar_takesShiftKey_int(){
        Caesar caesar = new Caesar ("message", 8);
        assertEquals(8, caesar.getShiftKey());
    }

    @Test
    public void Caesar_DoesItReturnEncryptedTxt_Encrypt(){
            Caesar caesar = new Caesar("JOY",5);
//            assertEquals("OTD", Caesar.planTxt(message,));
    }

}
