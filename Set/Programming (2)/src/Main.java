import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      Set<String> set = new TreeSet<>();
      for (int i = 0; i < count; i++) {
        set.add(scanner.next());
      }
      for (String str: set) {
        System.out.println(str);
      }
    }
  }
}