import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String cipher1 = scanner.nextLine();
    String cipher2 = scanner.nextLine();
    Map<Character,Character> encodeMap = new TreeMap<>();
    Map<Character,Character> decryptMap = new TreeMap<>();

    for (int i = 0; i < cipher1.length();i++) {
      encodeMap.put(cipher1.charAt(i), cipher2.charAt(i));
      decryptMap.put(cipher2.charAt(i), cipher1.charAt(i));
    }

    String encodeStr = scanner.nextLine();
    String decryptStr = scanner.nextLine();

    for (int i = 0; i < encodeStr.length();i++)
      System.out.print(encodeMap.get(encodeStr.charAt(i)));
    System.out.println();

    for (int i = 0; i < decryptStr.length();i++)
      System.out.print(decryptMap.get(decryptStr.charAt(i)));
  }
}