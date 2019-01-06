import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Set<String> known = new HashSet<>();
    Set<String> errors = new HashSet<>();

    Scanner scanner = new Scanner(System.in);

    int c = scanner.nextInt();

    for (int i = 0; i < c; i++) {
      known.add(scanner.next().toLowerCase());
    }

    scanner.nextInt();

    while (scanner.hasNext()){
      String next = scanner.next().toLowerCase();
      if (!known.contains(next)){
        errors.add(next);
      }
    }

    for (String str: errors) {
      System.out.println(str);
    }

  }
}