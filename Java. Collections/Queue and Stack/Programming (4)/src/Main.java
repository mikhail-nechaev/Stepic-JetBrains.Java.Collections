import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    Scanner in = new Scanner(System.in);
    String[] str = in.nextLine().split("");
    for (String c : str) {
      String t = deque.peekLast();
      if (c.equals("(") || c.equals("[") || c.equals("{")) deque.addLast(c) ;
      if (c.equals(")")) {
        if (t.equals("(")) deque.pollLast();
        else deque.offerLast(")");
      }
      if (c.equals("]")) {
        if (t.equals("[")) deque.pollLast();
        else deque.offerLast("]");
      }
      if (c.equals("}")) {
        if (t.equals("{")) deque.pollLast();
        else deque.offerLast("}");
      }
    }
    if (deque.size()==0 ) System.out.println("true");
    else System.out.println("false");
  }
}
