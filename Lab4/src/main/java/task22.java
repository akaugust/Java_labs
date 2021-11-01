import java.util.*;

public class task22 {
    /*
    22.	Создайте приложение для просмотра списка элементов
    и изменения значений элементов списка.
    Список (5 элементов типа Integer) создается в программе
    и является объектом класса  ArrayList.
     */

    ArrayList<Integer> arr = new ArrayList<>();

    task22(String[] args) {
        for (String arg : args) {
            arr.add(Integer.parseInt(arg));
        }
    }

    static boolean originalArrayIsNumeric(String[] arguments) {

        boolean flag = true;
        for (String s : arguments) {
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                flag = false;
            }
        }
        return flag;
    }

    static int printArrList(ArrayList<Integer> arr){
        System.out.println("ArrayList: " + arr);
        return 0;
    }

    static ArrayList<Integer> changeValue(ArrayList<Integer> ourList, int pos, int num){
        ArrayList<Integer> changedList = new ArrayList<>(ourList);
        changedList.set(pos - 1, num);
        return changedList;
    }

    int getPlace(){

        int pos;
        do{
            System.out.print("Enter the position of the element you want to change " +
                    "(between 1 and 5): ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a needed position! Write a position again: ");
                input.next();
            }
            pos = input.nextInt();
        }while (pos < 1 || pos > 5);
        return pos;
    }

    int getNumber(){

        System.out.print("Enter the new value (Integer): ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("This is not an integer! Write a number again: ");
            input.next();
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Wrong number of arguments!");
            return;
        }
        if (!originalArrayIsNumeric(args)) {
            System.out.println("Arguments must be Integers!");
            return;
        }
        task22 intArrList = new task22(args);
        printArrList(intArrList.arr);

        int place = intArrList.getPlace();
        int number = intArrList.getNumber();

        intArrList.arr = changeValue(intArrList.arr, place, number);
        printArrList(intArrList.arr);
    }

}

