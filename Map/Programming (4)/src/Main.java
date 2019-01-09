import java.util.*;

public class Main {

  public static void main(String[] args) {
    Map<Character, Character> cipherMap = new HashMap<>();

    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        String keys = scanner.next();
        String values = scanner.next();

        for (int i = 0; i < keys.length(); i++) {
          cipherMap.put(keys.charAt(i), values.charAt(i));
        }

        String inputKeys = scanner.next();
        String inputValues = scanner.next();

        StringBuilder encode = new StringBuilder();
        StringBuilder decode = new StringBuilder();

        for (int j = 0; j < inputKeys.length(); j++) {
          encode.append(cipherMap.get(inputKeys.charAt(j)));
        }

        System.out.println(encode);

        cipherMap.clear();

        for (int k = 0; k < keys.length(); k++) {
          cipherMap.put(values.charAt(k), keys.charAt(k));
        }

        for (int l = 0; l < inputValues.length(); l++) {
          decode.append(cipherMap.get(inputValues.charAt(l)));
        }

        System.out.println(decode);
      }
    }

  }
}