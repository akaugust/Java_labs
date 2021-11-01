import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbonentTest {

    Abonent test;

    @BeforeEach
    void setUp() {
        test = new Abonent("Aaa", "Bbb", "Ddd", "Door 1");
    }

    @Test
    void getSurname() {
        String actual = "Aaa";
        String expected = test.getSurname();
        assertEquals(actual, expected);
    }

    @Test
    void getName() {
        String actual = "Bbb";
        String expected = test.getName();
        assertEquals(actual, expected);
    }

    @Test
    void getPatronymic() {
        String actual = "Ddd";
        String expected = test.getPatronymic();
        assertEquals(actual, expected);
    }

    @Test
    void getAddress() {
        String actual = "Door 1";
        String expected = test.getAddress();
        assertEquals(actual, expected);
    }

    @Test
    void testToString() {
        String actual = "Abonent{surname = Aaa, name = Bbb, patronymic = Ccc, address = Door 1}";
        String expected = test.toString();
        assertEquals(actual, expected);
    }
}