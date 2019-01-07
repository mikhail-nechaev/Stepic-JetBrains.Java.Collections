import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();

      Deque<Integer> queue = new ArrayDeque<>();

      for (int i = 0; i < count; i++) {
        queue.addFirst(scanner.nextInt());
      }

      for (int val: queue) {
        System.out.println(val);
      }
    }
  }
}