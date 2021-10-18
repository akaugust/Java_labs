import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class task12Test {

    String[] arguments = new String[]{"12", "11", "4", "5", "-13"};

    @Test
    void originalArrayIsNumeric() {
        boolean expected = task12.originalArrayIsNumeric(arguments);
        assertTrue(expected);
    }

    @Test
    void createArray() {
        int [] arr = new int[]{12, 11, 4, 5, -13};
        int [] expected = task12.createArray(arguments);
        assertEquals(Arrays.toString(expected), Arrays.toString(arr));
    }

    @Test
    void isAscending() {
        int [] test = new int[]{1, 2, 3};
        boolean expected = task12.IsAscending(test);
        assertTrue(expected);
    }

    @Test
    void isDescending() {
        int [] test = new int[]{3, 2, 1};
        boolean expected = task12.IsDescending(test);
        assertTrue(expected);
    }
}