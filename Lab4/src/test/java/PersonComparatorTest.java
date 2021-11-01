import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonComparatorTest {

    @Test
    void compare() {
        QueuePerson one = new QueuePerson(3, "Aaa", "Aaa", "Aaa",
                new AddressValue("Aaa", "Bbb", "5", 1));
        QueuePerson two = new QueuePerson(2, "Bbb", "Bbb", "Bbb",
                new AddressValue("Bbb", "Bbb", "5", 4));
        PersonComparator test = new PersonComparator();
        assertEquals(1, test.compare(one, two));
    }
}