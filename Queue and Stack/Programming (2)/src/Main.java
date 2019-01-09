import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfItems = scanner.nextInt();
      Deque<Integer> dequeOfItems = new ArrayDeque<>();
      for (int i = 0; i < numOfItems; i++) {
        dequeOfItems.add(scanner.nextInt());
      }

      for (int i = 0; i < numOfItems; i++) {
        System.out.println(dequeOfItems.pollLast());
      }
    }
  }
}