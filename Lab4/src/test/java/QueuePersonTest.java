import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuePersonTest {

    QueuePerson test;

    @BeforeEach
    void setUp() {
        test = new QueuePerson(1, "Aaa", "Bbb", "Ccc", new AddressValue("Aaa", "Bbb", "5", 0));
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
        String actual = "Ccc";
        String expected = test.getPatronymic();
        assertEquals(actual, expected);
    }

    @Test
    void getAddress() {
        AddressValue actual = new AddressValue("Aaa", "Bbb", "5", 0);
        AddressValue expected = test.getAddress();
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    void getPriority() {
        int actual = 1;
        int expected = test.getPriority();
        assertEquals(actual, expected);
    }

    @Test
    void setPriority() {
        int actual = 2;
        test.setPriority(actual);
        int expected = test.getPriority();
        assertEquals(actual, expected);
    }

    @Test
    void testToString() {
        String actual = "1. QueuePerson{surname = Aaa, name = Bbb, patronymic = Ccc, address = AddressValue{city = Aaa, street = Bbb, building = 5}}";
        String expected = test.toString();
        assertEquals(actual, expected);
    }
}