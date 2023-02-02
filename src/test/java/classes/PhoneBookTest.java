package classes;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

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
        phoneBook.add(valid, number);
        String result = phoneBook.findByNumber(number);
        assertNotNull(result);
        assertEquals(valid, result);
    }

    @Test
    void findByNameTest() {
        Long valid = 88005553535L;
        String name = "Petya";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, valid);

        Long result = phoneBook.findByName(name);
        assertNotNull(result);
        assertEquals(valid, result);
    }

    @Test
    void printAllNamesTest() {

        String name = "Petya";
        Long number = 88005553535L;

        HashMap<String, Long> contacts = new HashMap<>();
        contacts.put("Petya", 88005553535L);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, number);

        HashMap<String, Long> result = phoneBook.printAllNames();
        assertNotNull(result);
        assertEquals(1, result.size());

    }

}