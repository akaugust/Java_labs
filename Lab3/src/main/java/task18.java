import java.util.regex.Pattern;

public class task18 {
    /*
    18.	Анализ типов аргументов, задаваемых при запуске программы.
    Если аргумент является числом с плавающей точкой
    (шаблон: состоит из мантиссы – одна или несколько цифр,
    возможно со знаком "+" или "-", которая может содержать десятичную точку в начале,
    середине или конце, а также порядка – целого числа со знаком "+" или "-" или без знака,
    разделителем между мантиссой и порядком служит символ "e" или символ "E"),
    то  тип аргумента "Float", иначе "String".
    Программа выводит количество заданных аргументов и, для каждого аргумента, его тип и значение.
     */
    public static StringBuffer analiseStr(String[] arguments){
        StringBuffer input = new StringBuffer();
        for (String argument : arguments) {
            input.append(argument);
            if (Pattern.matches("[+-]?\\d+(\\.\\d+)?([Ee][+-]?\\d+)?", argument)) {
                input.append(" is Float Type\n");
            } else {
                input.append(" is String Type\n");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No arguments to check!");
            return;
        }
        StringBuffer str = analiseStr(args);
        System.out.printf("There are %d arguments:\n%s", args.length, str);
    }
}
