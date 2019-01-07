import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Deque<Integer> first = new ArrayDeque<>();
      int firstSum = 0;
      Deque<Integer> second = new ArrayDeque<>();
      int secondSum = 0;
      int count = scanner.nextInt();
      for (int i = 0; i < count; i++) {
        int id = scanner.nextInt();
        int in = scanner.nextInt();
        if (firstSum <= secondSum) {
          first.add(id);
          firstSum += in;
        } else {
          second.add(id);
          secondSum += in;
        }
      }
      for (int val: first) {
        System.out.print(val + " ");
      }
      System.out.println();
      for (int val: second) {
        System.out.print(val + " ");
      }
    }
  }
}