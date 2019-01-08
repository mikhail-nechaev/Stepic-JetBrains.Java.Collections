import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();

    int size = in.nextInt();

    for (int i = 0; i < size; i++) {
      stack.push(in.nextInt());
    }

    for (int i = 0; i < size; i++) {
      System.out.println(stack.pop());
    }

  }
}