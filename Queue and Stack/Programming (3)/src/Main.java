import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in  = new Scanner(System.in);
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    int size = in.nextInt(), next;

    for (int i = 0; i < size; i++) {
      next = in.nextInt();
      if (next % 2 == 0)
        deque.addFirst(next);
      else
        deque.addLast(next);
    }

    for (int i = 0; i < size; i++) {
      System.out.println(deque.pollFirst());
    }

  }
}