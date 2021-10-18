import java.util.Scanner;

public class task18 {
    /*
    18.	Квадратное уравнение задано
    действительными коэффициентами A, B, C.
    Проверить, имеет ли оно целые корни.
    */
    public static boolean check_input(Scanner input, double[] array){

        boolean flag = true;
        for(int i = 0; i < array.length; ++i) {
            if(input.hasNextDouble()) {
                array[i] = input.nextDouble();
            } else {
                System.out.println("You can only enter integers!");
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        double[] numbers = new double[3];
        System.out.println("Equation: Ax^2 + Bx + C = 0");
        System.out.print("Enter A, B and C: ");
        Scanner input = new Scanner(System.in);
        if (check_input(input, numbers)) {
            double a = numbers[0], b = numbers[1], c = numbers[2];
            double D = b * b - 4 * a * c;
            System.out.printf("D = %.3f", D);
            if (D >= 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                if (x1 % 1 == 0 || x2 % 1 == 0) {
                    System.out.printf("Equation has integer roots!\nx1 = %.3f, x2 = %.3f", x1, x2);
                } else {
                    System.out.printf("Equation does not have integer roots!\nx1 = %.3f, x2 = %.3f", x1, x2);
                }
            } else {
                System.out.println("Equation does not have integer roots!");
            }
        }
    }
}
