import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Integer> map = new HashMap<>();
            while (scanner.hasNext()) {
                String s = scanner.next().toLowerCase();
                if (map.containsKey(s)) {
                    int k = map.get(s);
                    map.put(s, ++k);
                } else {
                    map.put(s, 1);
                }
            }

            for (Map.Entry<String, Integer> letter : map.entrySet()) {
                System.out.println(letter.getKey() + " " + letter.getValue());
            }
        }
    }
}