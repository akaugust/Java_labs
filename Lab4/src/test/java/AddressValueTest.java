import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressValueTest {

    AddressValue address;

    @BeforeEach
    void setUp() {
        address = new AddressValue("Aaa", "Bbb", "5", 0);
    }

    @Test
    void getCity() {
        String actual = "Aaa";
        String expected = address.getCity();
        assertEquals(actual, expected);
    }

    @Test
    void getStreet() {
        String actual = "Bbb";
        String expected = address.getStreet();
        assertEquals(actual, expected);
    }

    @Test
    void getBuilding() {
        String actual = "5";
        String expected = address.getBuilding();
        assertEquals(actual, expected);
    }

    @Test
    void getApartment() {
        int actual = 0;
        int expected = address.getApartment();
        assertEquals(actual, expected);
    }

    @Test
    void testToString() {
        String actual = "AddressValue{city = Aaa, street = Bbb, building = 5}";
        String expected = address.toString();
        assertEquals(actual, expected);
    }
}