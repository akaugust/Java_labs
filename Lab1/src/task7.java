import java.util.Scanner;

public class task7 {
    /*
    7.	Дана площадь квадрата. Найти сторону данного
    квадрата и минимальную сторону квадрата,
    в который исходный квадрат может быть вписан.
    */
    public static void main(String[] args) {

        System.out.print("Enter the area of the square: ");
        Scanner input = new Scanner(System.in);
        if(input.hasNextDouble()) {
            double area = input.nextDouble();
            if (area > 0) {
                double side = Math.sqrt(area);
                System.out.println("The side of the square = " + side);
                System.out.println("The minimum side of the square around = " + side * Math.sqrt(2));
            } else {
                System.out.println("You can only enter positive numbers!");
            }
        } else {
            System.out.println("You can only enter numbers!");
        }
    }
}