import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();
    Deque<Integer> stack = new ArrayDeque<>();
    while (scanner.hasNextInt()) {
      stack.push(scanner.nextInt());
    }
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}