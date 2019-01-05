import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    SortedMap<Integer, String> map = new TreeMap<>();

    Scanner scanner = new Scanner(System.in);
    int min = scanner.nextInt();
    int max = scanner.nextInt();
    scanner.nextInt();

    while (scanner.hasNext()) {
      int key = scanner.nextInt();
      String value = scanner.next();

      if (key >= min && key <= max) {
        map.put(key, value);
      }
    }

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }
}