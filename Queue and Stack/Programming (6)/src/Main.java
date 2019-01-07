import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      maxStack max = new maxStack();
      Deque<Integer> deque = new ArrayDeque<>();
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < count; i++) {
        String comand = scanner.next();
        switch (comand){
          case "push" :
            int val = scanner.nextInt();
            deque.addFirst(val);
            max.push(val);
            break;
          case "pop" :
            deque.remove();
            max.pop();
            break;
          case "max" :
            System.out.println(max.getMax());
        }
      }
    }
  }

  static class maxStack extends Stack<Integer> {
    Stack<Integer> max = new Stack<>();

    void push(int val) {
      if (isEmpty()) {
        super.push(val);
        max.push(val);
      } else {
        super.push(val);
        int cur = max.pop();
        max.push(cur);
        if(val > cur) {
          max.push(val);
        } else {
          max.push(cur);
        }
      }
    }

    public Integer pop() {
      int val = super.pop();
      max.pop();
      return val;
    }

    int getMax() {
      int val = max.pop();
      max.push(val);
      return val;
    }
  }
}