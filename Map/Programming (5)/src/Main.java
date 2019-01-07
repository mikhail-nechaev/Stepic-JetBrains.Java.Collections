import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    SortedMap<Integer, String> map = new TreeMap<>();

    int from = scan.nextInt();
    int to = scan.nextInt();

    int times = scan.nextInt();

    for (int i = 0; i < times; i++)
    {
      int key = scan.nextInt();
      if (from <= key && key <= to)
      {
        map.put(key, scan.next());
      }
      else
      {
        scan.next();
      }
    }

    for (Map.Entry<Integer, String> pair: map.entrySet())
    {
      System.out.println(pair.getKey() + " " + pair.getValue());
    }

  }
}
