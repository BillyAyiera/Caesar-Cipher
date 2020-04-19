import org.junit.Test;

import static org.junit.Assert.*;

public class caesarTest {
    @Test
    public void encryptDecrypt_savesMessage_String() {
        caesar testVal = new caesar("hello", 3);
        assertEquals("hello", testVal.getTextMessage());
    }

    @Test
    public void encryptDecrypt_savesShiftValue_Integer() {
        caesar testVal = new caesar("hello", 3);
        assertEquals(3, testVal.getShiftBy());
    }

    @Test
    public void encryptDecrypt_ShiftsTextForward_StringBuilder() {
        caesar testVal = new caesar("hello", 3);
        assertEquals("kabob", testVal.encryption());
    }

    @Test
    public void encryptDecrypt_decipherText_String() {
        caesar testVal = new caesar("kabob", 3);
        assertEquals("hello", testVal.decryption());
    }

    @Test
    public void encryptDecrypt_objectInstantiates() {
        caesar testVal = new caesar("hello", 3);
        assertEquals(true, testVal instanceof caesar);

    }
}