import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    Deque<Character> stack = new ArrayDeque<>();
    for (char c: input.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        char tmp = stack.pop();
        if ((c == '{' && tmp == '}') || (c == '(' && tmp == ')')
        || (c == '[' && tmp == ']')) {

        }
      }
    }
  }
}