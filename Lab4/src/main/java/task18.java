import java.util.*;

public class task18 {
    /*
    18.	Создайте приложение для просмотра списка книг в
    библиотечном каталоге и изменения цены книги.
    Список книг (5 записей) создается в программе
    и является объектом класса HashMap.
    Ключом записи является индекс ISBN книги (типа Integer),
    а значением – объект Book, содержащий наименование книги,
    ФИО автора, издательство (все записи типа String),
    год издания (типа int) и цену книги (типа float).
    Предусмотреть возможность сортировки книг по издательству или цене,
    используя ArrayList.
     */

    Map<Integer, Book> Catalog = new HashMap<>();

    task18(){

//        for (int i = 0; i < 1; i++){
//            int key = addKey();
//            Book value = addValue();
//            Catalog.put(key, value);
//        }

        Catalog.put(123, new Book("Aaa Aaa Aaa", "Aaa", "Alexa House", 1895, 453.59f));
        Catalog.put(124, new Book("Hhh Hhh Hhh", "Bbb", "Holy House", 1094, 48.12f));
        Catalog.put(125, new Book("Fff Fff Fff", "Ddd", "Frozen House", 564, 145.23f));
        Catalog.put(126, new Book("Ddd Ddd Ddd", "Eee", "Daniel House", 1999, 145.12f));
        Catalog.put(127, new Book("Eee Eee Eee", "Eee", "Estra House", 1998, 14.12f));
     }

    int addKey(){
        int code;
        System.out.print("Enter the Book`s ISBN : ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.print("This is not a needed code! Write it again: ");
            input.next();
        }
        code = input.nextInt();
        return code;
    }

    Book addValue(){
        String info = addFIO();
        String name = addName();
        String publ = addPublishing();
        int year = addYear();
        float price = findPrice();
        return new Book(info, name, publ, year, price);
    }

    String addFIO(){
        String info;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Authors`s surname, name and patronymic: ");
            info = in.nextLine();
        } while (!info.matches("([A-Z][a-z]+\\s){2}[A-Z][a-z]+"));
        return info;
    }

    String addName(){
        String name;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Book`s name: ");
            name = in.nextLine();
        } while (!name.matches("[A-Z][a-z]+"));
        return name;
    }

    String addPublishing(){
        String publ;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the Book`s publishing house: ");
            publ = in.nextLine();
        } while (!publ.matches("[A-Z][a-z]+\\s[A-Z][a-z]+"));
        return publ;
    }

    int addYear(){
        int year;
        do{
            System.out.print("Enter the Book`s year: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a year! Write it again: ");
                input.next();
            }
            year = input.nextInt();
        }while (year <= 0 || year > 2021);
        return year;
    }

    int findKey(Map<Integer, Book> catBook){

        int code;
        do{
            System.out.print("Enter the Book`s ISBN to change the price: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()){
                System.out.print("This is not a needed code! Write it again: ");
                input.next();
            }
            code = input.nextInt();
        }while (!catBook.containsKey(code));
        return code;
    }

    float findPrice(){

        float price;
        do{
            System.out.print("Enter the Book`s price: ");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextFloat()){
                System.out.print("This is not a price! Write it again: ");
                input.next();
            }
            price = input.nextFloat();
        }while (price <= 0.0f);
        return price;
    }

    public static int showMap(Map<Integer, Book> telBook){
        for(Map.Entry<Integer, Book> item : telBook.entrySet()){
            System.out.println(item.getKey() + "=" + item.getValue().toString());
        }
        return 0;
    }

    public static Map<Integer, Book> changePrice(Map<Integer, Book> catBook, int code, float price){
        Map<Integer, Book> changedBook = new HashMap<>(catBook);
        Book obj = changedBook.get(code);
        obj.setPrice(price);
        return changedBook;
    }

    public static List<Map.Entry<Integer, Book>> sortedByPublishing(Map<Integer, Book> bookCatalog) {
        List<Map.Entry<Integer, Book>> bookList = new ArrayList<>(bookCatalog.entrySet());
        bookList.sort(Comparator.comparing((Map.Entry<Integer, Book> item) -> item.getValue().getPublishing()));
        return bookList;
    }

    public static List<Map.Entry<Integer, Book>> sortedByPrice(Map<Integer, Book> bookCatalog) {
        List<Map.Entry<Integer, Book>> bookList = new ArrayList<>(bookCatalog.entrySet());
        bookList.sort(Comparator.comparing((Map.Entry<Integer, Book> item) -> item.getValue().getPrice()));
        return bookList;
    }

    public static void main(String[] args) {
        task18 bookCatalog = new task18();
        showMap(bookCatalog.Catalog);
        System.out.println("Let`s change a price of the book!");
        int isbn = bookCatalog.findKey(bookCatalog.Catalog);
        float newPrice = bookCatalog.findPrice();
        bookCatalog.Catalog = changePrice(bookCatalog.Catalog, isbn, newPrice);
        showMap(bookCatalog.Catalog);
        List<Map.Entry<Integer, Book>> sortedCatalog = sortedByPublishing(bookCatalog.Catalog);
        System.out.println("Sorted by Publishing: ");
        sortedCatalog.forEach(System.out::println);
        sortedCatalog = sortedByPrice(bookCatalog.Catalog);
        System.out.println("Sorted by Price: ");
        sortedCatalog.forEach(System.out::println);

    }
}




