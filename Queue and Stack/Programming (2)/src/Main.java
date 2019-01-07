import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();

    int size = scan.nextInt();

    for (int i = 0; i < size; i++)
    {
      deque.addLast(scan.nextInt());
    }

    for (int i = 0; i < size; i++)
    {
      System.out.println(deque.pollLast());
    }
  }
}