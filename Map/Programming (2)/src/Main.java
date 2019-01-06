import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()){
      String next = scanner.next().toLowerCase();
      if (map.containsKey(next)){
        int c = map.get(next);
        map.replace(next, ++c);
      } else {
        map.put(next, 1);
      }
    }

    for (Map.Entry<String, Integer> entry: map.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }
}