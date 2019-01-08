import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println(rightConsisting(in.nextLine()));

  }

  private static boolean rightConsisting(String str) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case '{':
          stack.push('{');
          break;
        case '(':
          stack.push('(');
          break;
        case '[':
          stack.push('[');
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(')
            return false;
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[')
            return false;
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{')
            return false;
          break;
      }
    }

    return stack.isEmpty();
  }
}