package banat1.tect_10__17.hw10_17.hw16;

public class lect16 {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("John Doe", "123-456-7890");
        pb.add("John Doe", "098-765-4321");
        pb.add("Jane Smith", "555-123-4567");

        System.out.println(pb.find("John Doe")); // Output: [123-456-7890, 098-765-4321]
        System.out.println(pb.find("Jane Smith")); // Output: [555-123-4567]
        System.out.println(pb.containsPhoneNumber("123-456-7890")); // Output: true
        System.out.println(pb.containsPhoneNumber("000-000-0000")); // Output: false
    }
}
