package banat1.tect_10__17.hw10_17.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> entries;

    public Phonebook() {
        entries = new HashMap<>();
    }

    // Method to add a name and call number to the phonebook
    public void add(String name, String callNumber) {
        entries.putIfAbsent(name, new ArrayList<>());
        entries.get(name).add(callNumber);
    }

    // Method to find all call numbers associated with a given name
    public List<String> find(String name) {
        return entries.getOrDefault(name, new ArrayList<>());
    }

    // Method to check if a call number exists in the phonebook
    public boolean containsPhoneNumber(String callNumber) {
        for (List<String> callNumbers : entries.values()) {
            if (callNumbers.contains(callNumber)) {
                return true;
            }
        }
        return false;
    }
}
