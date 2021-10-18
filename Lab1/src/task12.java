import java.util.Scanner;

public class task12 {
    /*
    12.	Дано целое трехзначное число.
    Найти сумму и произведение его цифр.
    */
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()) {
            int num = input.nextInt();
            if(num >= 100 && num <= 999) {
                int sum = 0, prod = 1, digit;
                for(int i = 100; i >= 1; i /= 10) {
                    digit = num / i;
                    num -= digit * i;
                    sum += digit;
                    prod *= digit;
                }
                System.out.println("Sum of digits = " + sum);
                System.out.println("Product of digits = " + prod);
            } else {
                System.out.println("Your number does not have three digits!");
            }
        } else {
            System.out.println("You can only enter integers!");
        }
    }
}
