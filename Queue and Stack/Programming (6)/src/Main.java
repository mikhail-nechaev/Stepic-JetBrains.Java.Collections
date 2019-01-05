import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> max = new Stack<>();

    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();

    for (int i = 0; i < c; i++) {
      String cmd = scanner.next();
      switch (cmd) {
        case "push":
          int pushable = scanner.nextInt();
          main.push(pushable);
          if (max.isEmpty()) {
            max.push(pushable);
            break;
          }
          if (pushable > max.peek()) {
            max.push(pushable);
            break;
          } else {
            max.push(max.peek());
            break;
          }
        case "pop":
          main.pop();
          max.pop();
          break;
        case "max":
          System.out.println(max.peek());
          break;
      }
    }

  }
}