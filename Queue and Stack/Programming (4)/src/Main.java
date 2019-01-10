import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    Deque<Character> stack = new ArrayDeque<>();
    boolean answer = true;
    for (char c: input.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          answer = false;
          break;
        }
        char tmp = stack.pop();
        if (!((tmp == '{' && c == '}') || (tmp == '(' && c == ')')
        || (tmp == '[' && c == ']'))) {
          answer = false;
          break;
        }
      }
    }
    if (!stack.isEmpty()) {
      answer = false;
    }
    System.out.println(answer);
  }
}