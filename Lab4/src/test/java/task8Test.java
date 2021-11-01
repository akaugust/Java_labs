import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class task8Test {

    LinkedList<QueuePerson> queue = new LinkedList<>();
    LinkedList<QueuePerson> actual = new LinkedList<>();

    @BeforeEach
    void setUp() {
        actual.add(new QueuePerson(1, "Ccc", "Ccc", "Ccc",
                new AddressValue("Ccc", "Ccc", "5", 2)));
        actual.add(new QueuePerson(2, "Aaa", "Aaa", "Aaa",
                new AddressValue("Aaa", "Bbb", "5", 1)));
        actual.add(new QueuePerson(3, "Bbb", "Bbb", "Bbb",
                new AddressValue("Bbb", "Bbb", "5", 4)));


        queue.add(new QueuePerson(2, "Aaa", "Aaa", "Aaa",
                new AddressValue("Aaa", "Bbb", "5", 1)));
        queue.add(new QueuePerson(3, "Bbb", "Bbb", "Bbb",
                new AddressValue("Bbb", "Bbb", "5", 4)));
        queue.add(new QueuePerson(1, "Ccc", "Ccc", "Ccc",
                new AddressValue("Ccc", "Ccc", "5", 2)));
    }

    @Test
    void showList() {
        int actual = 0;
        int expected = task8.showList(queue);
        assertEquals(actual, expected);
    }

    @Test
    void sortToPriority() {
        LinkedList<QueuePerson> expected = task8.sortToPriority(queue);
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    void addToSorted() {
        actual.add(new QueuePerson(4, "Eee", "Eee", "Eee",
                new AddressValue("Eee", "Eee", "5", 3)));
        LinkedList<QueuePerson> expected = task8.addToSorted(queue, new QueuePerson(4, "Eee", "Eee", "Eee",
                new AddressValue("Eee", "Eee", "5", 3)));
        assertEquals(actual.toString(), expected.toString());

    }

    @Test
    void changePriority() {
        actual.remove(2);
        actual.add(new QueuePerson(5, "Bbb", "Bbb", "Bbb",
                new AddressValue("Bbb", "Bbb", "5", 4)));

        LinkedList<QueuePerson> expected = task8.changePriority(queue, 2, 5);
        assertEquals(actual.toString(), expected.toString());
    }
}