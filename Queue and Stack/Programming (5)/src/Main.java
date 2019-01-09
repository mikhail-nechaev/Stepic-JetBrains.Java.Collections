import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Deque<Integer> deque1 = new ArrayDeque<>();
    Deque<Integer> deque2 = new ArrayDeque<>();
    int sum1 = 0;
    int sun2 = 0;
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int val1 = scanner.nextInt();
      int val2 = scanner.nextInt();
      if (sum1 <= sun2) {
        deque1.add(val1);
        sum1 += val2;
      } else {
        deque2.add(val1);
        sun2 += val2;
      }
    }
    for (int val : deque1)
      System.out.print(val + " ");

    System.out.println();
    for (int val : deque2)
      System.out.print(val + " ");
  }
}