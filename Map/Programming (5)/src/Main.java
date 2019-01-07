import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int min = scanner.nextInt();
      int max = scanner.nextInt();
      int count = scanner.nextInt();
      Map<Integer, String> map = new TreeMap<>();
      for (int i = 0; i < count; i++) {
        int key = scanner.nextInt();
        if (key <= max && key >= min) {
          map.put(key, scanner.next());
        }
        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }
      }
      for (int i = 0; i < map.size(); i++) {
        int key = (int) map.keySet().toArray()[i];
        System.out.println(key + " " + map.get(key));
      }
    }
  }
}