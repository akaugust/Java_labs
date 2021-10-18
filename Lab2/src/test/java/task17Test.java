import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class task17Test {

    String[] arguments = new String[]{"-1", "2", "15", "-5"};
    int[] arr = new int[]{-1, 2, 15, -5};

    @Test
    void originalArrayIsNumeric() {
        boolean expected = task17.originalArrayIsNumeric(arguments);
        assertTrue(expected);
    }

    @Test
    void createArray() {
        int [] expected = task17.createArray(arguments);
        assertEquals(Arrays.toString(expected), Arrays.toString(arr));
    }

    @Test
    void findMaxValue() {
        int actual = 15;
        int expected = task17.findMaxValue(arr);
        assertEquals(actual, expected);
    }

    @Test
    void createArrayB() {
        int[] actual = new int[]{16, 13, 0, 20};
        int[] expected = task17.createArrayB(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}