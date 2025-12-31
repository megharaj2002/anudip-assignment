import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");

        System.out.println("Updated HashSet: " + set);
    }
}
