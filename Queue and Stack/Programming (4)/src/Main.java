import java.util.*;

public class Main {

  public static void main(String[] args) {
    String inputString;
    try (Scanner scanner = new Scanner(System.in)) {
      inputString = scanner.next();
    }
    Stack<Character> brackets = new Stack<>();
    boolean stackIsEmpty = true;
    for (int i = 0; i < inputString.length(); i++) {
      char element = inputString.charAt(i);

      if(element == '[' || element == '(' || element == '{' ) {
        brackets.push(element);
      } else if(element == ']') {
        if(brackets.isEmpty() || brackets.pop() != '[') {
          stackIsEmpty = false;
          break;
        }
      } else if(element == ')') {
        if(brackets.isEmpty() || brackets.pop() != '(') {
          stackIsEmpty = false;
          break;
        }
      } else if(element == '}') {
        if(brackets.isEmpty() || brackets.pop() != '{') {
          stackIsEmpty = false;
          break;
        }
      }
    }

    if (!stackIsEmpty) {
      System.out.println(stackIsEmpty);
    } else {
      stackIsEmpty = brackets.isEmpty();
      System.out.println(stackIsEmpty);
    }

  }
}