import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    ArrayDeque<Integer> max = new ArrayDeque<>();
    int request = in.nextInt();
    String[] input;

    for (int i = 0; i < request + 1; i++) {
      input = in.nextLine().split(" ");
      switch (input[0]) {
        case "push":
          int add = Integer.valueOf(input[1]);
          stack.push(add);
          if (max.isEmpty())
            max.add(add);
          else
            max.add(Math.max(add,max.peekLast()));
          break;
        case "max":
          System.out.println(max.peekLast());
          break;
        case "pop":
          stack.pop();
          max.pollLast();
          break;
      }
    }

  }
}