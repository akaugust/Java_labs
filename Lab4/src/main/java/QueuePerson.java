public class QueuePerson {
    String surname, name, patronymic;
    AddressValue address;
    int priority;

    public QueuePerson(int priority, String surname, String name, String patronymic, AddressValue address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.priority = priority;
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

    AddressValue getAddress() {
        return address;
    }

    int getPriority(){
        return priority;
    }

    void setPriority(int priority){
        this.priority = priority;
    }

    @Override
    public String toString() {
        return priority + ". QueuePerson{" +
                "surname = " + surname +
                ", name = " + name +
                ", patronymic = " + patronymic +
                ", address = " + address +
                '}';
    }
}
