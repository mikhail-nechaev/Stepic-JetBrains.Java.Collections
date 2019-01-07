import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();

    for (int i = 0; i < size; i++)
    {
      int current = scan.nextInt();
      if (current % 2 == 0)
      {
        deque.addFirst(current);
      }
      else
      {
        deque.addLast(current);
      }
    }

    for (int i: deque)
    {
      System.out.println(i);
    }
  }
}