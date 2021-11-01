public class Abonent {
    String surname, name, patronymic, address;

    public Abonent(String surname, String name, String patronymic, String address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }

    String getPatronymic() {
        return patronymic;
    }

    String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "surname = " + surname +
                ", name = " + name +
                ", patronymic = " + patronymic +
                ", address = " + address +
                '}';
    }
}
