import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task18Test {

    @Test
    void analiseStr() {
        String actual = "+2e10 is Float Type\n+2e1.0 is String Type\n";
        String[] arguments = {"+2e10", "+2e1.0"};
        StringBuffer expected = task18.analiseStr(arguments);
        assertEquals(actual, expected.toString());
    }
}