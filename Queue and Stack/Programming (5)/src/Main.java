import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  static class QueueElem
  {
    public int identifier;
    public int loadInd;
  }

  public static void main(String[] args) {

    Deque<QueueElem> deque1 = new ArrayDeque<>();
    Deque<QueueElem> deque2 = new ArrayDeque<>();

    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();

    for (int i = 0; i < size; i++)
    {

      QueueElem elem = new QueueElem();
      elem.identifier = scan.nextInt();
      elem.loadInd = scan.nextInt();

      if (i == 0)
      {
        deque1.addLast(elem);
        continue;
      }

      if (i == 1)
      {
        deque2.addLast(elem);
        continue;
      }

      double load1 = 0, load2 = 0;

      for (QueueElem curr: deque1)
      {
        load1 += curr.loadInd;
      }
      load1 /= deque1.size();

      for (QueueElem curr: deque2)
      {
        load2 += curr.loadInd;
      }
      load2 /= deque2.size();

      if (load1 == load2)
      {
        deque1.addLast(elem);
      }
      else
      {
        if (load1 > load2)
        {
          deque2.addLast(elem);
        }
        else
        {
          deque1.addLast(elem);
        }
      }

    }

    for (QueueElem elem: deque1)
    {
      System.out.print(elem.identifier + " ");
    }
    if (!deque2.isEmpty())
    {
      System.out.println();
      for (QueueElem elem : deque2)
      {
        System.out.print(elem.identifier + " ");
      }
    }
  }
}