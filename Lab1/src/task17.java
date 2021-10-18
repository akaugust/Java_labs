import java.util.Scanner;

public class task17 {
    /*
    17.	Даны 4 целых числа. Найти их среднее
    арифметическое и ближайшее к нему целое.
    */
    public static void main(String[] args) {

        int[] numbers = new int[4];
        int sum = 0;
        boolean flag = true;
        System.out.print("Enter 4 numbers: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; ++i) {
            if(input.hasNextInt()) {
                numbers[i] = input.nextInt();
                sum += numbers[i];
            } else {
                System.out.println("You can only enter integers!");
                flag = false;
                break;
            }
        }
        if(flag) {
            float ar_mean = (float) sum / 4;
            System.out.println("Arithmetic mean of numbers = " + ar_mean);
            System.out.println("The closest integer = " + Math.round(ar_mean));
        }
    }
}
