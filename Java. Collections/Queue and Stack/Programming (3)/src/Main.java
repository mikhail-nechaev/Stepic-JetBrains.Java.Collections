import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int n = Integer.parseInt(s);
    for (int i=0 ; i< n;i++){
      int tmp = Integer.parseInt(in.nextLine());
      if (tmp%2==0) deque.addFirst(tmp);
      else deque.addLast(tmp);
    }
    for (Integer tmp: deque)System.out.println(tmp);
  }
}