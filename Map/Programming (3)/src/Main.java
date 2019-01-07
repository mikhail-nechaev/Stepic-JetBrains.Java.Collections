import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      Map<String, Integer> map = new TreeMap<>();
      List<String> dic = new ArrayList<>();
      for (int i = 0; i < count; i++) {
        dic.add(scanner.next().toLowerCase());
      }
      count = scanner.nextInt();
      scanner.nextLine();
      for (int i = 0; i < count; i++) {
        String[] line = scanner.nextLine().toLowerCase().split(" ");
        for (String word : line) {
          if (!dic.contains(word)) {
            map.put(word, 0);
          }
        }
      }
      for (int i = 0; i < map.size(); i++) {
        System.out.println(map.keySet().toArray()[i]);
      }
    }
  }
}