import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Deque<Integer> queue = new ArrayDeque<>();
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int val = scanner.nextInt();
      if (val % 2 == 0)
        queue.addFirst(val);
      else
        queue.addLast(val);
    }
    for (int val : queue)
      System.out.println(val);
  }
}