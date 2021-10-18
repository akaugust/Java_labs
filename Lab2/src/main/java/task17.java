import java.util.Arrays;

public class task17 {
    /*
    17.	Сформируйте из массива a массив b по следующему алгоритму:
    элемент массива b равен значению разности между максимальным
    значением элементов массива a и значением данного элемента массива a.
     */
    public static boolean originalArrayIsNumeric(String[] arr) {

        boolean flag = true;
        for (String s : arr) {
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                flag = false;
            }
        }
        return flag;
    }

    public static int[] createArray(String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);
        return arr;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
                max = Math.max(max, arr[i]);
        return max;
    }

    public static int[] createArrayB(int[] arr) {
        int[] temp = new int[arr.length];
        int maxValue = findMaxValue(arr);
        for (int i = 0; i < arr.length; i++)
            temp[i] = maxValue - arr[i];
        return temp;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("There are no arguments!");
            return;
        }
        if (originalArrayIsNumeric(args)) {
            int[] a = createArray(args);
            System.out.println("Array A: " + Arrays.toString(a));
            System.out.println("Array B: " + Arrays.toString(createArrayB(a)));
        }
    }
}
