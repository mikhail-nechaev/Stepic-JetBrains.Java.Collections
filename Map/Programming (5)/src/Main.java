import java.util.*;

public class Main {

  public static void main(String[] args) {
    int startKey, lastKey;
    int numOfPairs;
    Map<Integer, String> map = new TreeMap<>();

    try (Scanner scanner = new Scanner(System.in)) {
      startKey = scanner.nextInt();
      lastKey = scanner.nextInt();
      numOfPairs = scanner.nextInt();

      for (int i = 0; i < numOfPairs; i++) {
        map.put(scanner.nextInt(), scanner.next());
      }
    }

    map = ((TreeMap<Integer, String>) map).subMap(startKey, lastKey + 1);

    for (Map.Entry<Integer, String> element : map.entrySet()) {
      System.out.println(element.getKey() + " " + element.getValue());
    }
  }
}