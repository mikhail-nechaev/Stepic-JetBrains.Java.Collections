import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String initialAlphabet = scanner.nextLine();
    String newAlphabet = scanner.nextLine();
    Map<Character, Character> map = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
    for (int i = 0; i < initialAlphabet.length(); i++) {
      map.put(initialAlphabet.charAt(i), newAlphabet.charAt(i));
      map2.put(newAlphabet.charAt(i), initialAlphabet.charAt(i));
    }
    String plaintext = scanner.nextLine();
    String cipher = scanner.nextLine();
    for (char c: plaintext.toCharArray()) {
      System.out.print(map.get(c));
    }
    System.out.println();
    for (char c: cipher.toCharArray()) {
      System.out.print(map2.get(c));
    }

  }
}