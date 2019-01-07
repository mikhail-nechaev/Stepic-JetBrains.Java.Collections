import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      Deque<Character> deque = new ArrayDeque<>();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
          deque.addFirst(str.charAt(i));
        } else {
          if (deque.isEmpty()) {
            System.out.println("false");
            return;
          }
          char cur = deque.remove();
          if (cur == '{' && str.charAt(i) != '}' ||
                  cur == '[' && str.charAt(i) != ']' ||
                  cur == '(' && str.charAt(i) != ')') {
            System.out.println("false");
            return;
          }
        }
      }
      System.out.println(deque.isEmpty() ? "true" : "false");
    }
  }
}