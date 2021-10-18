public class task22 {
    /*
    22.	Анализ типов аргументов, задаваемых при запуске программы.
    Если аргумент имеет вид "имя=значение", то он является
    ключевым параметром (тип "Keyed"), если аргумент имеет вид "-значение"
    или "/значение", то он является опцией (тип "Optional") и если имеет вид "значение",
    то является непосредственным параметром (тип "Immediate"). Шаблон для значения:
    одна или несколько цифр и букв (включая буквы кириллицы).
    Программа выводит количество заданных аргументов и, для каждого аргумента,
    его тип и значение (для ключевых параметров дополнительно выводится имя параметра).
    */
    public static StringBuffer analiseStr(String[] arguments){
        StringBuffer input = new StringBuffer();
        String Immediate = "[\\wа-яА-Я]+";
        String Optional = "[/-]" + Immediate;
        String Keyed = "[a-zA-z]+=" + Immediate;
        for (String argument : arguments) {
            input.append(argument);
            if (argument.matches(Immediate)) {
                input.append(" is Immediate Type\n");
            } else if (argument.matches(Optional)) {
                input.append(" is Optional Type\n");
            } else if (argument.matches(Keyed)) {
                input.append(" is Keyed Type\n");
            } else {
                input.append(" is unknown Type\n");
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

