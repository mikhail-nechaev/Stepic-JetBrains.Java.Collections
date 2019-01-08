import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    TreeMap<String, Integer> dictionary = new TreeMap<>();
    String word;

    while (in.hasNext()) {
      word = in.next().toLowerCase();
      if (dictionary.containsKey(word)) {
        dictionary.put(word, dictionary.get(word) + 1);
      } else {
        dictionary.put(word, 1);
      }
    }

    Set<String> keys = dictionary.keySet();

    for (String key : keys) {
      System.out.println(key + " " + dictionary.get(key));
    }

  }
}