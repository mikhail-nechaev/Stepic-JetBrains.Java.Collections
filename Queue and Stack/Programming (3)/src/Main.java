import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfItems = scanner.nextInt();
      Deque<Integer> dequeOfItems = new ArrayDeque<>();
      for (int i = 0; i < numOfItems; i++) {
        int number = scanner.nextInt();
        if (number % 2 == 0) {
          dequeOfItems.addFirst(number);
        } else {
          dequeOfItems.addLast(number);
        }
      }

      for (int i = 0; i < numOfItems; i++) {
        System.out.println(dequeOfItems.pollFirst());
      }
    }
  }
}