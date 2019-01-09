import java.util.*;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> warAndPeace = new TreeMap<>();
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        String inputKey = scanner.next();
        inputKey = inputKey.toLowerCase();
        if (warAndPeace.containsKey(inputKey)) {
          warAndPeace.put(inputKey, warAndPeace.get(inputKey) + 1);
        } else {
          warAndPeace.put(inputKey, 1);
        }
      }
    }

    for (Map.Entry<String, Integer> element : warAndPeace.entrySet()) {
      System.out.println(element.getKey() + " " + element.getValue());
    }
  }
}