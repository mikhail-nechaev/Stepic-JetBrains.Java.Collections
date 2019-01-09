import java.util.*;

public class Main {

  public static void main(String[] args) {
    int numOfKeys, numOfStrings;
    Map<String, Integer> defaultKeys = new TreeMap<>();
    Map<String, Integer> resultMap = new TreeMap<>();

    try (Scanner scanner = new Scanner(System.in)) {
      numOfKeys = scanner.nextInt();

      for (int i = 0; i < numOfKeys; i++) {
        String inputKey = scanner.next();
        inputKey = inputKey.toLowerCase();
        defaultKeys.put(inputKey, 1);
      }

      numOfStrings = scanner.nextInt();

      for (int j = 0; j < numOfStrings; j++) {
        while (scanner.hasNext()) {
          String inputWord = scanner.next();
          inputWord = inputWord.toLowerCase();

          if (!defaultKeys.containsKey(inputWord)) {
            if (resultMap.containsKey(inputWord)) {
              resultMap.put(inputWord, resultMap.get(inputWord) + 1);
            } else {
              resultMap.put(inputWord, 1);
            }
          }
        }
      }
    }

    for (String result: resultMap.keySet()) {
      System.out.println(result);
    }
  }
}