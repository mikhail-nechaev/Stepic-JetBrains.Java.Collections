import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Map<Character, Character> map = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    String alph = scan.nextLine();
    String alphDec = scan.nextLine();

    for (int i = 0; i < alph.length(); i++)
    {
      map.put(alph.charAt(i), alphDec.charAt(i));
    }

    String str1 = scan.nextLine();

    for (int i = 0; i < str1.length(); i++)
    {
      System.out.print(map.get(str1.charAt(i)));
    }

    System.out.println();

    map.clear();

    for (int i = 0; i < alph.length(); i++)
    {
      map.put(alphDec.charAt(i), alph.charAt(i));
    }

    String str2 = scan.nextLine();

    for (int i = 0; i < str2.length(); i++)
    {
      System.out.print(map.get(str2.charAt(i)));
    }
  }
}