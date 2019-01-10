import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    scanner.nextLine();
    LinkedList<String> list = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      list.addLast(scanner.nextLine());
    }
    int amountOfRotations = scanner.nextInt();
    for (int i = 0; i < amountOfRotations; i++) {
      String tmp = list.pollLast();
      list.addFirst(tmp);
    }
    for (String s: list) {
      System.out.println(s);
    }
  }
}