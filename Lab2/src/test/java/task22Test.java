import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class task22Test {

    String[] arguments = new String[]{"5", "-1", "2", "4", "-7"};
    int[] arr = new int[]{5, -1, 2, 4, -7};

    @Test
    void originalArrayIsNumeric() {
        boolean expected = task22.originalArrayIsNumeric(arguments);
        assertTrue(expected);
    }

    @Test
    void createArray() {
        int [] expected = task22.createArray(arguments);
        assertEquals(Arrays.toString(expected), Arrays.toString(arr));
    }

    @Test
    void isInArray() {
        int num = 4;
        boolean expected = task22.isInArray(arr, num);
        assertTrue(expected);
    }

    @Test
    void createArrayB() {
        int[] actual = new int[]{0, 3, 2, 1, 4};
        int[] expected = task22.createArrayB(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}