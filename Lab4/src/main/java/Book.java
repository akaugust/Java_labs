public class Book {

    String author, name, publishing;
    int year;
    float price;

    public Book(String author, String name, String publishing, int year, float price) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublishing(){
        return publishing;
    }

    public int getYear(){
        return year;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author = " + author +
                ", name = " + name +
                ", publishing = " + publishing +
                ", year = " + year +
                ", price = " + price +
                '}';
    }
}
