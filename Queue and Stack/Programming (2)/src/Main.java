import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();

    Stack<Integer> stack = new Stack<>();

    while (scanner.hasNextInt()){
      stack.push(scanner.nextInt());
    }

    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }


  }
}