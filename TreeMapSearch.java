import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);
        map.put("David", 35);
        map.put("Eve", 22);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();

        if (map.containsKey(name)) {
            System.out.println("Age of " + name + ": " + map.get(name));
        } else {
            System.out.println("Name not found in the list.");
        }

        scanner.close();
    }
}
