import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> maxStack = new ArrayDeque<>();

    while (count > 0) {
      String command = scanner.next();
      switch (command) {
        case "push":
          int x = scanner.nextInt();
          stack.offerLast(x);
          if (maxStack.isEmpty())
            maxStack.offerLast(x);
          else
            maxStack.offerLast(Math.max(maxStack.peekLast(), x));
          break;
        case "pop":
          stack.pollLast();
          maxStack.pollLast();
          break;
        case "max":
          System.out.println(maxStack.peekLast());
      }
      count--;
    }
  }
}