import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    TreeMap<Character, Character> bio2pro = new TreeMap<>();
    TreeMap<Character, Character> pro2bio = new TreeMap<>();

    String key = in.next(), value = in.next();

    for (int i = 0; i < key.length(); i++) {
      bio2pro.put(key.charAt(i), value.charAt(i));
      pro2bio.put(value.charAt(i), key.charAt(i));
    }

    decode(in, bio2pro);
    decode(in, pro2bio);

  }

  private static void decode(Scanner in, TreeMap<Character, Character> codes) {
    String line1 = in.next();
    for (int i = 0; i < line1.length(); i++) {
      System.out.print(codes.get(line1.charAt(i)));
    }
    System.out.println();
  }
}