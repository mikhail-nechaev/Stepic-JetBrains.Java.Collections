import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();
    Deque<Integer> deque = new ArrayDeque<>();
    while (scanner.hasNextInt()) {
      int tmp = scanner.nextInt();
      if (tmp % 2 == 0) {
        deque.addFirst(tmp);
      } else {
        deque.addLast(tmp);
      }
    }
    while (!deque.isEmpty()) {
      System.out.println(deque.pop());
    }
  }
}