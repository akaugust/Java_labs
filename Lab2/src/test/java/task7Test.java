import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class task7Test {

    String[] arguments = new String[]{"-1", "3", "12", "2", "5", "7"};
    int [] arr = new int[]{-1, 3, 12, 2, 5, 7};

    @Test
    void originalArrayIsNumeric() {
        boolean expected = task7.originalArrayIsNumeric(arguments);
        assertTrue(expected);
    }

    @Test
    void createArray() {
        int [] expected = task7.createArray(arguments);
        assertEquals(Arrays.toString(expected), Arrays.toString(arr));
    }

    @Test
    void findMinSubtract() {
        int actual = 1;
        int expected = task7.findMinSubtract(arr);
        assertEquals(expected, actual);
    }
}