import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StackSim stack = new StackSim();

    int size = scan.nextInt();

    for (int i = 0; i < size; i++)
    {
      String str = scan.next();

      if (str.equals("push"))
      {
        int elem = scan.nextInt();
        stack.push(elem);
      }

      if (str.equals("pop"))
      {
        stack.pop();
      }

      if (str.equals("max"))
      {
        System.out.println(stack.max());
      }
    }
  }
}

class StackSim
{
  int[] data;
  int CAPASITY = 10;
  int size;
  Deque<Integer> MaxStack;


  public StackSim()
  {
    data = new int[CAPASITY];
    size = 0;
    MaxStack = new ArrayDeque<>();
  }

  public void push(int elem)
  {
    if (size == CAPASITY)
    {
      data = Arrays.copyOf(data, CAPASITY + 10);
      CAPASITY += 10;
    }
    data[size] = elem;
    ++size;
    if (!MaxStack.isEmpty())
    {
      if (MaxStack.peekFirst() <= elem)
      {
        MaxStack.addFirst(elem);
      }
    }
    else
    {
      MaxStack.addFirst(elem);
    }

  }

  public int pop()
  {
    int elem = data[size - 1];
    --size;
    if (size <= CAPASITY - 10)
    {
      data = Arrays.copyOf(data, CAPASITY - 10);
      CAPASITY -= 10;
    }


    if (elem == MaxStack.peekFirst())
    {
      MaxStack.pollFirst();
    }

    return elem;
  }

  public int max()
  {
    return MaxStack.peekFirst();
  }

}