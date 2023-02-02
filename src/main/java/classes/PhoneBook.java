package classes;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, Long> contacts = new HashMap<>();

    public PhoneBook() {

    }

    public int add(String name, Long number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(Long number) {
        if (contacts.containsValue(number)) {
            for (Map.Entry<String, Long> entry : contacts.entrySet()) {
                if (entry.getValue() == number) return entry.getKey();
            }
        }
        return null;
    }

    public Long findByName(String name) {
        return contacts.get(name);
    }
}
