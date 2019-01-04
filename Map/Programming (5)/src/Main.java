import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int count = scanner.nextInt();
            TreeMap<Integer, String> map = new TreeMap<>();
            while (count-- > 0) {
                map.put(scanner.nextInt(), scanner.next());
            }
            for (Map.Entry<Integer, String> entry : map.subMap(left, true, right, true).entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}