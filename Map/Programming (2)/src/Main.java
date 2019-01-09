import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SortedMap<String, Integer> mapWords = new TreeMap<>();

    while (scanner.hasNext()) {
      String currWord = scanner.next().toLowerCase();

      if (!mapWords.containsKey(currWord.toLowerCase()))
        mapWords.put(currWord, 1);
      else mapWords.put(currWord, mapWords.get(currWord) + 1);
    }

    for (Map.Entry<String, Integer> m : mapWords.entrySet())
      System.out.println(m.getKey() + " " + m.getValue());
  }
}