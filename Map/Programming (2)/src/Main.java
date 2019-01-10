import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] words = scanner.nextLine().toLowerCase().split(" ");
    Map<String, Integer> map = new HashMap<>();

    for (String s: words) {
      Integer amount = map.putIfAbsent(s, 1);
      if(amount != null) {
        map.replace(s, ++amount);
      }
    }
    map.forEach((s, i) -> System.out.println(s + " " + i));
  }
}