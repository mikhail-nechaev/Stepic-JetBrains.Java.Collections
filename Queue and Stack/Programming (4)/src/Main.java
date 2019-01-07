import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<Character> stack =  new ArrayDeque<>();
    Scanner scan = new Scanner(System.in);

      String current = scan.nextLine();
      char[] mass = current.toCharArray();

      for (int i = 0; i < mass.length; i++)
      {
        if (mass[i] == '(' || mass[i] == '[' || mass[i] == '{')
        {
          stack.addFirst(mass[i]);
        }
        else
        {
          if (stack.isEmpty())
          {
            System.out.print(false);
            return;
          }
          if (mass[i] == ')' && stack.peekFirst().equals('(')
                  || mass[i] == ']' && stack.peekFirst().equals('[')
                  || mass[i] == '}' && stack.peekFirst().equals('{'))
          {
            stack.removeFirst();
          }
          else
          {
            System.out.print(false);
            return;
          }
        }
      }
    System.out.print(stack.isEmpty());
  }
}