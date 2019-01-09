import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<Integer> nums= new ArrayList<>(Arrays.asList(2, 0, 1, 7));
    Deque<Integer> queue = new ArrayDeque<>();
    queue.addAll(nums);

    System.out.println(queue);
  }
}