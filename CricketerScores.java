import java.util.HashMap;
import java.util.Map;

public class CricketerScores {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Virat Kohli", 82);
        scores.put("Rohit Sharma", 89);
        scores.put("MS Dhoni", 45);

        String searchName = "Rohit Sharma";

        if (scores.containsKey(searchName)) {
            System.out.println(searchName + "'s score: " + scores.get(searchName));
        } else {
            System.out.println("Player not found.");
        }
    }
}
