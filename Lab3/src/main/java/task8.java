public class task8 {
    /*
    8.	Создайте программу, которая принимает произвольный текстовую строку,
    а возвращает другой, в котором символы располагаются в обратном порядке.
     */
    public static StringBuffer reverseStr (String input){
        return new StringBuffer(input).reverse();
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No string to reverse!");
            return;
        }
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        String str = String.join(" ", args);
        System.out.println("\n" + reverseStr(str));
    }
}
