import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    for (int i=0 ; i< n;i++)deque.addLast(in.nextLine());
    for (int i=0 ; i< n;i++)System.out.println(deque.pollLast());
  }
}