package classes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PhoneBookTest {

    @Test
    void addTest() {
        String name = "Petya";
        Long number = 88005553535L;
        int valid = 1;

        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add(name, number);
        assertNotNull(result);
        assertEquals(valid, result);
    }

    @Test
    void findByNumberTest() {
        Long number = 88005553535L;
        String valid = "Petya";

        PhoneBook phoneBook = new PhoneBook();
        String result = phoneBook.findByNumber(number);
        assertNotNull(result);
        assertEquals(valid, result);
    }
}