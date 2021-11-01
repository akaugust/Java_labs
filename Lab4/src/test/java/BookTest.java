import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Aaa", "Bbb", "Ccc", 1995, 456.15f);
    }

    @Test
    void getName() {
        String actual = "Bbb";
        String expected = book.getName();
        assertEquals(actual, expected);
    }

    @Test
    void getAuthor() {
        String actual = "Aaa";
        String expected = book.getAuthor();
        assertEquals(actual, expected);
    }

    @Test
    void getPublishing() {
        String actual = "Ccc";
        String expected = book.getPublishing();
        assertEquals(actual, expected);
    }

    @Test
    void getYear() {
        int actual = 1995;
        int expected = book.getYear();
        assertEquals(actual, expected);
    }

    @Test
    void getPrice() {
        float actual = 456.15f;
        float expected = book.getPrice();
        assertEquals(actual, expected);
    }

    @Test
    void setPrice() {
        float actual = 100.01f;
        book.setPrice(100.01f);
        float expected = book.getPrice();
        assertEquals(actual, expected);
    }

    @Test
    void testToString() {
        String actual = "Book{author = Aaa, name = Bbb, publishing = Ccc, year = 1995, price = 456.15}";
        String expected = book.toString();
        assertEquals(actual, expected);
    }
}