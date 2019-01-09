import java.util.*;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> firstQueue = new ArrayDeque<>();
    Deque<Integer> secondQueue = new ArrayDeque<>();
    try (Scanner scanner = new Scanner(System.in)) {
      int firstQueueTotalLoad = 0, secondQueueTotalLoad = 0;
      int numOfTasks = scanner.nextInt();

      for (int i = 0; i < numOfTasks; i++) {
        int id = scanner.nextInt();
        int load = scanner.nextInt();

        if (firstQueueTotalLoad <= secondQueueTotalLoad) {
          firstQueue.add(id);
          firstQueueTotalLoad += load;
        } else {
          secondQueue.add(id);
          secondQueueTotalLoad += load;
        }
      }
    }

    for (Integer element : firstQueue) {
      System.out.print(element + " ");
    }

    System.out.println();

    for (Integer element : secondQueue) {
      System.out.print(element + " ");
    }
  }
}