import java.util.HashMap;

public class CheckHashMapEmpty {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "apple");
        map.put("2", "banana");

        System.out.println("Is the HashMap empty? " + map.isEmpty());
        map.clear();
        System.out.println("Is the HashMap empty after clearing? " + map.isEmpty());
    }
}
