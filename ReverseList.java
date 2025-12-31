import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Original list: " + list);

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }
}
