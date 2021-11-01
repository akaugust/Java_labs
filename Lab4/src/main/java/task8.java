import java.util.*;

public class task8 {

    /*
    8.	Создайте приложение для просмотра списка очередников
    и изменения приоритета очередников в очереди.
    Список  (5 записей) создается в программе и является
    объектом класса LinkedList.
    Запись списка является объектом QueuePerson,
    содержащим поля фамилии, имени и отчества очередника (типа String),
    поле типа AddressValue для адреса очередника
    и приоритет очередника (типа int).
    В свою очередь, поле типа AddressValue содержит три поля типа String:
    наименование города, наименование улицы и номер дома,
    а также поле типа int – номер квартиры
    (если номер квартиры равен 0, дом,
    в котором проживает очередник, не имеет квартир).
    Записи в очереди сортируются в соответствии с приоритетом,
    и очередник добавляется последним в очереди приоритета.
     */

    LinkedList<QueuePerson> queue = new LinkedList<>();

    task8(){
//        for (int i = 0; i < 2; i++){
//            QueuePerson value = addValue();
//            queue.add(value);
//        }

        queue.add(new QueuePerson(2, "Aaa", "Aaa", "Aaa",
                new AddressValue("Aaa", "Bbb", "5", 1)));
        queue.add(new QueuePerson(3, "Bbb", "Bbb", "Bbb",
                new AddressValue("Bbb", "Bbb", "5", 4)));
        queue.add(new QueuePerson(1, "Ccc", "Ccc", "Ccc",
                new AddressValue("Ccc", "Ccc", "5", 2)));
        queue.add(new QueuePerson(6, "Ddd", "Ddd", "Ddd",
                new AddressValue("Ddd", "Ddd", "7", 0)));
        queue.add(new QueuePerson(4, "Eee", "Eee", "Eee",
                new AddressValue("Eee", "Eee", "5", 3)));
    }

    QueuePerson addValue(){

        int priority = addPriority();
        String[] info = addFIO();
        String[] address = addAddress();
        int apartment = addApartment();

        return new QueuePerson(priority, info[0], info[1], info[2],
                new AddressValue(address[0], address[1], address[2], apartment));
    }

    int addPriority(){
        int priority;
        do{
            System.out.print("Enter the Priority of Person: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a Priority! Write it again: ");
                input.next();
            }
            priority = input.nextInt();
        }while (priority <= 0);
        return priority;
    }

    String[] addFIO(){
        String info;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Person`s surname, name and patronymic: ");
            info = in.nextLine();
        } while (!info.matches("([A-Z][a-z]+\\s){2}[A-Z][a-z]+"));
        return info.split(" ");
    }

    String[] addAddress(){
        String address;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Person`s address(city, street, building): ");
            address = in.nextLine();
        } while (!address.matches("([A-Z][a-z]+\\s){2}[\\d]+"));
        return address.split(" ");
    }

    int addApartment(){
        int apartment;
        do{
            System.out.print("Enter the Person`s apartment: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a Priority! Write it again: ");
                input.next();
            }
            apartment = input.nextInt();
        }while (apartment < 0);
        return apartment;
    }

    static public int getPosition(LinkedList<QueuePerson> queueList){
        int position;
        do{
            System.out.print("Enter the Position of Person which priority we need to change: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a Position! Write it again: ");
                input.next();
            }
            position = input.nextInt();
        }while (position > queueList.size() || position <= 0);
        return position;
    }

    static public int showList(LinkedList<QueuePerson> list) {
        for(QueuePerson person : list){
            System.out.println(person.toString());
        }
        return 0;
    }

    static public LinkedList<QueuePerson> sortToPriority(LinkedList<QueuePerson> queueList){
        LinkedList<QueuePerson> sortedList = new LinkedList<>(queueList);
        sortedList.sort(new PersonComparator());
        return sortedList;
    }

    static public LinkedList<QueuePerson> addToSorted(LinkedList<QueuePerson> queueList, QueuePerson person){
        LinkedList<QueuePerson> newList = new LinkedList<>(queueList);
        newList.add(person);
        newList = sortToPriority(newList);
        return newList;
    }

    static public LinkedList<QueuePerson> changePriority(LinkedList<QueuePerson> queueList, int position, int priority){
        LinkedList<QueuePerson> changedList = new LinkedList<>(queueList);
        QueuePerson neededPerson = changedList.get(position - 1);
        neededPerson.setPriority(priority);
        changedList = sortToPriority(changedList);
        return changedList;
    }

    public static void main(String[] args) {
        task8 peopleQueue = new task8();

        System.out.println("Unsorted List: ");
        showList(peopleQueue.queue);

        System.out.println("Sorted List: ");
        peopleQueue.queue = sortToPriority(peopleQueue.queue);
        showList(peopleQueue.queue);

        System.out.println("Adding new element to List: ");
        QueuePerson newValue = peopleQueue.addValue();
        peopleQueue.queue = addToSorted(peopleQueue.queue, newValue);
        showList(peopleQueue.queue);

        System.out.println("Changing priority in List: ");
        int pos = getPosition(peopleQueue.queue);
        int changedPriority = peopleQueue.addPriority();
        peopleQueue.queue = changePriority(peopleQueue.queue, pos, changedPriority);
        showList(peopleQueue.queue);
    }
}
