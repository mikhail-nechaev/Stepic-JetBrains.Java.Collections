import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Stack stack = new Stack();
    for (int i = 0; i < n; i++) {
      switch (scanner.next()) {
      case "push":
        stack.push(scanner.nextInt());
        break;
      case "pop":
        stack.pop();
        break;
      case "max":
        System.out.println(stack.max());
        break;
      }
    }
  }
}

class Stack {
  private Deque<Integer> values;
  private Deque<Integer> maxes;

  public Stack() {
    values = new ArrayDeque<>();
    maxes = new ArrayDeque<>();
  }

  public int pop() {
    maxes.pop();
    return values.pop();
  }

  public int max() {
    int tmp = maxes.pop();
    maxes.push(tmp);
    return tmp;
  }

  public void push(int val) {
    values.push(val);
    if (val > this.max()) {
      maxes.push(this.max());
    } else {
      maxes.push(this.max());
    }
  }
}