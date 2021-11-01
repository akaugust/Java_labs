import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

class task22Test {

    ArrayList<Integer> task = new ArrayList<>();
    String[] arguments = new String[]{"-1", "3", "12"};

    @BeforeEach
    void setUp() {
       for (String arg : arguments) {
            task.add(Integer.parseInt(arg));
        }
    }

    @Test
    void printArrList(){
        int actual = 0;
        int expected = task22.printArrList(task);
        assertEquals(actual, expected);
    }

    @Test
    void originalArrayIsNumeric() {
        boolean expected = task22.originalArrayIsNumeric(arguments);
        assertTrue(expected);
    }

    @Test
    void changeValue() {
        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(3);
        actual.add(12);
        ArrayList<Integer> expected = task22.changeValue(task, 1, 1);
        assertEquals(actual, expected);
    }
}