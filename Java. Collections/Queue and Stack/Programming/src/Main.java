import java.util.*;

public class Main {

  public static void main(String[] args) {


    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.addLast(2);
    queue.addLast(0);
    queue.addLast(1);
    queue.addLast(7);

    System.out.println(queue);

  }
}