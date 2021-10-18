import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task8Test {

    @Test
    void reverseStr() {
        String actual = "avaJ";
        StringBuffer expected = task8.reverseStr("Java");
        assertEquals(actual, expected.toString());
    }
}