import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import  java.util.List;

class task18Test {

    Map<Integer, Book> Catalog = new HashMap<>();

    @BeforeEach
    void setUp() {
        Catalog.put(123, new Book("Aaa Aaa Aaa", "Aaa", "Alexa House", 1895, 453.59f));
        Catalog.put(124, new Book("Hhh Hhh Hhh", "Bbb", "Holy House", 1094, 48.12f));
        Catalog.put(125, new Book("Fff Fff Fff", "Ddd", "Frozen House", 564, 145.23f));
    }

    @Test
    void showMap() {
        int actual = 0;
        int expected = task18.showMap(Catalog);
        assertEquals(actual, expected);
    }

    @Test
    void changePrice() {
        float actual = 101.01f;
        Map<Integer, Book> test = task18.changePrice(Catalog, 124, 101.01f);
        Book obj = test.get(124);
        float expected = obj.getPrice();
        assertEquals(actual, expected);
    }
}