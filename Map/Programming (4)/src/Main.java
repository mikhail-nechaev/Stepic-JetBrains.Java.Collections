import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String letters = scanner.nextLine();
      String symbols = scanner.nextLine();
      Map<Character, Character> map = new HashMap<>();
      Map<Character, Character> revert = new HashMap<>();
      for (int i = 0; i < letters.length(); i++) {
        map.put(letters.charAt(i), symbols.charAt(i));
        revert.put(symbols.charAt(i), letters.charAt(i));
      }
      String encode = scanner.nextLine();
      String decrypt = scanner.nextLine();
      for (int i = 0; i < encode.length(); i++) {
        System.out.print(map.get(encode.charAt(i)));
      }
      System.out.println();
      for (int i = 0; i < decrypt.length(); i++) {
        System.out.print(revert.get(decrypt.charAt(i)));
      }
    }
  }
}