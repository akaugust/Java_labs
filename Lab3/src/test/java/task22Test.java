import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task22Test {

    @Test
    void analiseStr() {
        String actual = "/abc is Optional Type\nabc=абв123 is Keyed Type\n";
        String[] arguments = {"/abc", "abc=абв123"};
        StringBuffer expected = task22.analiseStr(arguments);
        assertEquals(actual, expected.toString());
    }
}