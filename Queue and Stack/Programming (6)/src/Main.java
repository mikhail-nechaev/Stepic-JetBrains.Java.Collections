import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      int numOfTasks = scanner.nextInt();
      StringBuilder answer = new StringBuilder();
      Deque<Integer> dequeOfElements = new ArrayDeque<>();
      Queue<Integer> queueOfMaxElements = new PriorityQueue<>(Collections.reverseOrder());

      for (int i = 0; i < numOfTasks; i++) {
        String inputString = scanner.next();

        switch (inputString){
        case "push":
          int element = scanner.nextInt();
          dequeOfElements.add(element);
          queueOfMaxElements.add(element);
          break;
        case "pop":
          queueOfMaxElements.remove(dequeOfElements.removeLast());
          break;
        case "max":
          answer.append(queueOfMaxElements.peek() + "\n");
          break;
        }
      }
      System.out.println(answer.toString());
    }

  }
}