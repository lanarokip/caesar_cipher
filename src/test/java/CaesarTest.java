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
    public void Decryption_decryptMethod_text() {
        Decrypt decrypt = new Decrypt("aron",5);
        assertEquals("ARON", Decrypt.planTxt2("fwts", 5));
    }

    @Test
    public void Caesar_encyptMethod_text() {
        Caesar caesar = new Caesar("fwts",5);
        assertEquals("FWTS", Caesar.planTxt("aron",5));
    }
    }


