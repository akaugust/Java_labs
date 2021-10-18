import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class task27Test {

    int[] arrFirst = new int[]{1, 2}, arrSecond = new int[]{2, 1};
    int counter = 2;

    @Test
    void argumentsCheck() {
        String[] arguments = new String[]{"2", "1"};
        boolean expected = task27.argumentsCheck(arguments);
        assertTrue(expected);
    }

    @Test
    void createRandomArray() {
        int[] arr = task27.createRandomArray(5);
        boolean expected = true;
        for (int j : arr) {
            if (!(j >= 0 && j <= 6)) {
                expected = false;
                break;
            }
        }
        assertTrue(expected);
    }

    @Test
    void countSameElements() {
        int expected = task27.countSameElements(arrFirst, arrSecond);
        assertEquals(expected, counter);
    }

    @Test
    void indexesOfElements() {
        int[][] actual = new int[][]{{0, 1}, {1, 0}};
        int[][] expected = task27.indexesOfElements(arrFirst, arrSecond, counter);
        for(int i = 0; i < counter; i++){
            assertEquals(Arrays.toString(expected[i]), Arrays.toString(actual[i]));
        }
    }
}