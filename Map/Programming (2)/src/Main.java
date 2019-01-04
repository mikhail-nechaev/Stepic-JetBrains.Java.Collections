import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] words = scanner.nextLine().split(" ");
            Map<String, Integer> freq = new HashMap<>();
            for (String word : words) {
                word = word.toLowerCase();
                freq.putIfAbsent(word, 0);
                freq.put(word, freq.get(word) + 1);
            }
            for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}