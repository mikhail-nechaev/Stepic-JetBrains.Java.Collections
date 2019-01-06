import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();

    Deque<Integer> deque = new ArrayDeque<>();

    while (scanner.hasNextInt()){
      int next = scanner.nextInt();
      if (next%2==0){
        deque.addFirst(next);
      } else {
        deque.addLast(next);
      }
    }

    while (!deque.isEmpty()){
      System.out.println(deque.pop());
    }
  }
}