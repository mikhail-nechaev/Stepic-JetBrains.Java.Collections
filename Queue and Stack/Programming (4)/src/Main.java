import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();

    String opening = "([{";

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (!opening.contains(Character.toString(ch)) && ch != ']' && ch != ')' && ch != '}'){
        System.out.println("false");
        return;
      }
      if (opening.contains(Character.toString(ch))){
        stack.push(ch);
      } else {
        if (stack.isEmpty()){
          System.out.println("false");
          return;
        }
        char last = stack.pop();
        switch (last){
          case '{':
            if (ch != '}'){
              System.out.println("false");
              return;
            }
            break;
          case '(':
            if (ch != ')'){
              System.out.println("false");
              return;
            }
            break;
          case '[':
            if (ch != ']'){
              System.out.println("false");
              return;
            }
            break;
        }
      }
    }

    if (!stack.isEmpty()){
      System.out.println("false");
      return;
    }

    System.out.println("true");

  }
}