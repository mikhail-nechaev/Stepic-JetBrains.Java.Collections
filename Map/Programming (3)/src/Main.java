import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Set<String> set = new HashSet<>();
    Map<String, Boolean> map = new HashMap<>();

    int libWords = scan.nextInt();
    for (int i = 0; i < libWords; i++)
    {
      set.add(scan.next().toLowerCase());
    }

    int newWords = scan.nextInt();
    while (scan.hasNext())
    {
      String str = scan.next().toLowerCase();
      if (set.contains(str))
      {
        map.put(str, false);
      }
      else
      {
        map.put(str, true);
      }
    }

    for(Map.Entry<String, Boolean> current: map.entrySet())
    {
      if (current.getValue())
      {
        System.out.println(current.getKey());
      }
    }
  }
}
