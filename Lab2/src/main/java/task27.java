import java.util.Arrays;
import java.util.Random;

public class task27 {
    /*
    27.	Определить количество   равных элементов и их индексы для двух исходных    одномерных массивов a и b.
     */
    public static boolean argumentsCheck(String[] arr) {

        boolean flag = true;
        for (String s : arr) {
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Arguments can be only numbers!");
                flag = false;
            }
        }
        return flag;
    }

    static int[] createRandomArray(int num) {
        Random random = new Random();
        int[] temp = new int[num];
        for (int i = 0; i < num; i++) {
            temp[i] = random.nextInt(7);
        }
        return temp;
    }

    static int countSameElements(int[] arr_a, int[] arr_b) {
        int count = 0;
        for (int i : arr_a) {
            for (int j : arr_b) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] indexesOfElements(int[] arr_a, int[] arr_b, int num) {
        int[][] temp = new int[num][2];
        for (int i = 0, n = 0; i < arr_a.length; i++) {
            for (int j = 0; j < arr_b.length; j++) {
                if (arr_a[i] == arr_b[j]) {
                    temp[n][0] = i;
                    temp[n][1] = j;
                    n++;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Not 2 arguments!");
            return;
        }
        if (argumentsCheck(args)) {
            int[] a = createRandomArray(Integer.parseInt(args[0]));
            int[] b = createRandomArray(Integer.parseInt(args[1]));
            System.out.println("Array A: " + Arrays.toString(a));
            System.out.println("Array B: " + Arrays.toString(b));
            int counter = countSameElements(a, b);
            System.out.printf("There are %d pair(s) of same elements:\n", counter);
            if(counter > 0){
                int[][] indexes = indexesOfElements(a, b, counter);
                for (int i = 0, j = 0; i < counter; i++) {
                    System.out.printf("a[%d] = b[%d]\n", indexes[i][j], indexes[i][j+1]);
                }
            }
        }

    }
}
