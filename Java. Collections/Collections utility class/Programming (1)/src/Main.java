import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] split = in.nextLine().split(" ");
    int r = Integer.parseInt(split[0]);
    int c = Integer.parseInt(split[1]);
    Map<Integer, String> map = new LinkedHashMap<>();
    for (int i=0;i<r;i++)  {
      String s = in.nextLine();
      map.put(i,s);
    }
    String s =in.nextLine();
    int n = Integer.parseInt(s);
    List keys = new ArrayList(map.keySet());
    Collections.rotate(keys,n);
    for (Object key : keys) System.out.println(map.get(key));
  }
}