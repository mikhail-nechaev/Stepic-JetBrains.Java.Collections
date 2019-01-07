import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();

    while (scan.hasNextInt())
    {
      list.add(scan.nextInt());
    }

    Object[] mass = list.toArray();
    int size = list.size();
    for (int i = 0; i < size; i += 2)
    {
      mass[i] = null;
    }

    for (int i = size - 1; i >= 0; i--)
    {
      if (mass[i] != null)
      {
        System.out.print(mass[i] + " ");
      }
    }
  }
}