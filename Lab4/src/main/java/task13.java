import java.util.*;

public class task13 {
    /*
    13.	Создайте приложение для изменения
    абонента телефонной сети.
    Список абонентов (5 записей) создается в программе
    и является объектом класса HashMap.
    Ключом записи является номер телефона (типа Integer),
    а значением – объект Abonent, содержащий четыре значения
    типа String:  фамилию, имя, отчество и адрес.
    Предусмотреть возможность сортировки по фамилии
    с помощью ArrayList.
     */

    Map<Integer, Abonent> telAbonent = new HashMap<>();

    task13() {
//        for (int i = 0; i < 5; i++){
//            int key = addKey();
//            Abonent value = addValue();
//            telAbonent.put(key, value);
//        }
        telAbonent.put(123, new Abonent("Alexa", "Aaa", "Aaa", "Door 1"));
        telAbonent.put(124, new Abonent("Holy", "Bbb", "Bbb", "Door 2"));
        telAbonent.put(125, new Abonent("Chris", "Ccc", "Ccc", "Door 3"));
        telAbonent.put(126, new Abonent("Frozen", "Ddd", "Ddd", "Door 4"));
        telAbonent.put(127, new Abonent("Daniel", "Eee", "Eee", "Door 5"));

    }

    int addKey(){
        System.out.print("Enter the Abonent`s telephone: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("This is not a telephone! Write it again: ");
            input.next();
        }
        return input.nextInt();
    }

    Abonent addValue(){

        String info;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Abonent`s surname, name and patronymic: ");
            info = in.nextLine();
        } while (!info.matches("([A-Z][a-z]+\\s){2}[A-Z][a-z]+"));
        String[] temp = info.split(" ");

        String address;
        do {
            System.out.print("Enter the Abonent`s address: ");
            address = in.nextLine();
        } while (!address.matches("[A-Z][a-z]+\\s[\\d]+"));
        return new Abonent(temp[0], temp[1], temp[2], address);
    }

    public static Map<Integer, Abonent> changeAbonent(Map<Integer, Abonent> telBook, int tel, Abonent info){
        Map<Integer, Abonent> changedAbonent = new HashMap<>(telBook);
        if(changedAbonent.containsKey(tel)){
            changedAbonent.replace(tel, info);
        } else {
            changedAbonent.put(tel, info);
        }
        return changedAbonent;
    }

    public static int showMap(Map<Integer, Abonent> telBook){
        for(Map.Entry<Integer, Abonent> item : telBook.entrySet()){
            System.out.println(item.getKey() + "=" + item.getValue().toString());
        }
        return 0;
    }

    public static List<Map.Entry<Integer, Abonent>> sortedTelBook(Map<Integer, Abonent> telBook) {
        List<Map.Entry<Integer, Abonent>> telList = new ArrayList<>(telBook.entrySet());
        telList.sort(Comparator.comparing((Map.Entry<Integer, Abonent> item) -> item.getValue().getSurname()));
        return telList;
    }

    public static void main(String[] args) {
        task13 AbonentList = new task13();
        showMap(AbonentList.telAbonent);

        System.out.println("Let`s change an Abonent!");
        int pos = AbonentList.addKey();
        Abonent value = AbonentList.addValue();
        AbonentList.telAbonent = changeAbonent(AbonentList.telAbonent, pos, value);
        showMap(AbonentList.telAbonent);

        List<Map.Entry<Integer, Abonent>> sortedBook = sortedTelBook(AbonentList.telAbonent);
        System.out.println("Sorted by surname: ");
        sortedBook.forEach(System.out::println);
    }
}