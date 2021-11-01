public class AddressValue {
    String city, street, building;
    int apartment;

    public AddressValue(String city, String street, String building, int apartment) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    String getCity() {
        return city;
    }

    String getStreet() {
        return street;
    }

    String getBuilding() {
        return building;
    }

    public int getApartment(){
        return apartment;
    }

    @Override
    public String toString() {
        if (apartment != 0) {
            return "AddressValue{" +
                    "city = " + city +
                    ", street = " + street +
                    ", building = " + building +
                    ", apartment = " + apartment +
                    '}';
        }
        else return "AddressValue{" +
                "city = " + city +
                ", street = " + street +
                ", building = " + building +
                '}';
    }
}
