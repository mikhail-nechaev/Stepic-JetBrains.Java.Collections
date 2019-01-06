import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SortedMap<Integer, String> pairs = new TreeMap<>();
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int n = scanner.nextInt();

            while (n-- > 0) {
                pairs.put(scanner.nextInt(), scanner.next());
            }

            pairs = pairs.subMap(from, ++to);

            for (Map.Entry<Integer, String> pair : pairs.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
    }
}