import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<String> voc = new ArrayList<>();

    for (int i = 0; i < n; i++)
      voc.add(scanner.next().toLowerCase());

    n = scanner.nextInt();
    scanner.nextLine();
    Map<String, Integer> map = new TreeMap<>();

    for (int i = 0; i < n; i++) {
      String[] line = scanner.nextLine().toLowerCase().split(" ");
      for (String word : line)
        if (!voc.contains(word))
          map.put(word, 0);
    }

    for (int i = 0; i < map.size(); i++)
      System.out.println(map.keySet().toArray()[i]);
  }
}