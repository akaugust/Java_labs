import java.util.Arrays;

public class task7 {
    /*
    7.	Определить   абсолютное значение наименьшей разности между двумя любыми значениями элементов исходного одномерного массива a.
     */
    public static boolean originalArrayIsNumeric(String[] arr) {

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

    public static int[] createArray(String[] args) {

        int len = args.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(args[i]);
        return arr;
    }

    public static int findMinSubtract(int[] arr) {
        int min = Integer.MAX_VALUE, len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(arr[i] - arr[j]) < min)
                    min = Math.abs(arr[i] - arr[j]);
            }
        }
        return min;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("There are no arguments!");
            return;
        }
        if (originalArrayIsNumeric(args)) {
            int[] a = createArray(args);
            System.out.println("Array: " + Arrays.toString(a));
            System.out.printf("The minimal subtract of array is %d", findMinSubtract(a));
        }
    }
}
