import java.util.Arrays;

public class task12 {
    /*
    12.	Определить, образуют ли значения    элементов исходного
    одномерного массива a: строго возрастающую последовательность
    (ai < ai+1), строго убывающую последовательность (ai > ai+1)
    или элементы массива не упорядочены и вывести для каждого случая соответствующее сообщение.
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

    public static boolean IsAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i -1])
                return false;
        return true;
    }

    public static boolean IsDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("There are no arguments!");
            return;
        }
        if (originalArrayIsNumeric(args)) {
            int[] a = createArray(args);
            System.out.println("Array: " + Arrays.toString(a));
            System.out.print("Type of sort: ");
            if(IsAscending(a))
                System.out.println("Ascending");
            else if (IsDescending(a)) {
                System.out.println("Descending");
            } else
                System.out.println("Not sorted at all");

        }
    }
}
