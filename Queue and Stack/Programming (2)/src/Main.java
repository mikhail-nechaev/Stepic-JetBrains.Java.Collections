import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int n = scanner.nextInt();

    while (n != 0) {
      deque.push(scanner.nextInt());
      n--;
    }
    while (!deque.isEmpty())
      System.out.println(deque.remove());
  }
}