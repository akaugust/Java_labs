import java.util.Arrays;

public class task22 {
    /*
    22.	Сформировать массив b,   элементами которого
    являются значения индексов элементов исходного
    одномерного массива  a в порядке убывания значений элементов.
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

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        return arr;
    }

    public static boolean isInArray(int[] arr, int element) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        return Arrays.binarySearch(temp, element) >= 0;
    }

    public static int[] createArrayB(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length), b = new int[arr.length];
        Arrays.sort(temp);
        for (int i = temp.length - 1, key = 0; i >= 0; i--, key++) {
            for (int j = 0; j < arr.length; ++j) {
                if (temp[i] == arr[j] && (key == 0 || !isInArray(b, j))) {
                    b[key] = j;
                    break;
                }
            }
        }
        return b;
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
