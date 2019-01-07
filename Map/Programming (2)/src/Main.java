import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine().toLowerCase();
      Map<String, Integer> map = new HashMap<>();
      String[] arr = str.split(" ");
      for (int i = 0; i < arr.length; i++) {
        if (!map.containsKey(arr[i])) {
          map.put(arr[i], 1);
        } else {
          int count = map.get(arr[i]);
          map.put(arr[i], count + 1);
        }
      }
      for (int i = 0; i < map.size(); i++) {
        String key = (String) map.keySet().toArray()[i];
        System.out.println(key + " " + map.get(key));
      }
    }
  }
}