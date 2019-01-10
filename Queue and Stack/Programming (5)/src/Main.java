import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Deque<Integer> deque1 = new ArrayDeque<>();
    Deque<Integer> deque2 = new ArrayDeque<>();
    int loadFactor1 = 0;
    int loadFactor2 = 0;
    for (int i = 0; i < n; i++) {
      int newIndex = scanner.nextInt();
      int load = scanner.nextInt();
      if (loadFactor2 < loadFactor1) {
        deque2.addLast(newIndex);
        loadFactor2+=load;
      } else {
        deque1.addLast(newIndex);
        loadFactor1+=load;
      }
    }
    Iterator<Integer> iterator = deque1.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
    iterator = deque2.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}