import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String alp = scanner.nextLine();
    String alpen = scanner.nextLine();
    String toCode = scanner.nextLine();
    String toDecode = scanner.nextLine();
    scanner.close();

    Map<Character, Character> encode = new HashMap<>();
    Map<Character, Character> decode = new HashMap<>();

    for (int i = 0; i < alp.length(); i++) {
      encode.put(alp.charAt(i), alpen.charAt(i));
      decode.put(alpen.charAt(i), alp.charAt(i));
    }

    for (int i = 0; i < toCode.length(); i++) {
      System.out.print(encode.get(toCode.charAt(i)));
    }

    System.out.println();

    for (int i = 0; i < toDecode.length(); i++) {
      System.out.print(decode.get(toDecode.charAt(i)));
    }

  }
}