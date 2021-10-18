import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task13Test {

    String text = new String("abc");
    int key = 2;

    @Test
    void encrypt() {
        String actual = "cde";
        StringBuffer expected = task13.encrypt(text, key);
        assertEquals(actual, expected.toString());
    }

    @Test
    void decrypt() {
        String actual = "yza";
        StringBuffer expected = task13.decrypt(text, key);
        assertEquals(actual, expected.toString());
    }
}