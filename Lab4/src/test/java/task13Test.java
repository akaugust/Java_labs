import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class task13Test {

    Map<Integer, Abonent> telAbonent = new HashMap<>();

    @BeforeEach
    void setUp() {
        telAbonent.put(123, new Abonent("Alexa", "Aaa", "Aaa", "Door 1"));
        telAbonent.put(124, new Abonent("Holy", "Bbb", "Bbb", "Door 2"));
        telAbonent.put(125, new Abonent("Chris", "Ccc", "Ccc", "Door 3"));
    }

    @Test
    void changeAbonent() {
        Map<Integer, Abonent> actual = new HashMap<>();
        actual.put(123, new Abonent("Alexa", "Aaa", "Aaa", "Door 1"));
        actual.put(124, new Abonent("Daniel", "Eee", "Eee", "Door 5"));
        actual.put(125, new Abonent("Chris", "Ccc", "Ccc", "Door 3"));
        Map<Integer, Abonent> expected = task13.changeAbonent(telAbonent, 124, new Abonent("Daniel", "Eee", "Eee", "Door 5"));

        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    void showMap() {
        int actual = 0;
        int expected = task13.showMap(telAbonent);
        assertEquals(actual, expected);
    }
}