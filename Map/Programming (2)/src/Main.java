import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Map<String, Integer> map = new HashMap<>();

    while(scan.hasNext())
    {
      String str = scan.next().toLowerCase();
      if (!map.containsKey(str))
      {
        map.put(str, 1);
      }
      else
      {
        int val = map.get(str);
        map.remove(str);
        map.put(str, ++val);
      }
    }

    for (Map.Entry<String, Integer> elem: map.entrySet())
    {
      System.out.println(elem.getKey() + " " + elem.getValue());
    }
  }
}