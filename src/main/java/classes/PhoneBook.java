package classes;

import java.util.HashMap;

public class PhoneBook {

    HashMap<String, Long> contacts = new HashMap<>();

    public PhoneBook() {

    }

    public int add(String name, Long number) {
        contacts.put(name, number);
        return contacts.size();
    }
}
